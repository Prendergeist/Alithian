<template>
  <div class="main-box">
    <div class="main-text">
      <h2>{{ article.name }}</h2>
      <div style="display: flex;				flex-direction: row;
				justify-content: center;
				align-items: center;">
        <div style=""> <img :src="baseUrl + article.url" /></div>
        <div>
          <p style="flex: 7;">{{ article.article }}</p>
        </div>
      </div>
    </div>
    <div class="main-comment">
      <ul>
        <li style="display: flex;border-bottom: 1px dotted white;margin-top: 10px;" v-for="item in article.comments">
          <div><img src="../../assets/image/df1.png" /></div>
          <div>
            <div>
              <p> {{ item.context }}</p>
            </div>
            <div style="text-align: start;"> <span>publish at {{ item.time }}</span></div>
          </div>

        </li>
      </ul>
    </div>
    <div class="main-input">
      <div style="height: 200px;margin: 0 auto;">
        <el-input style="background-color: #0077AA;" type="textarea" :row="200" v-model="text.context"
          placeholder="comment..."></el-input>
        <div style="display: flex;justify-content: end;"> <el-button class="logA" @click="addCmooent"
            type="">submit</el-button></div>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios"

export default {

  mounted () {
    this.initpage()
  },
  data () {
    return {
      article: {},
      text: {
        artId: this.$route.query.t,
        uid: JSON.parse(localStorage.getItem("INFO"))?.id || null,
        context: "",
      },
      baseUrl: "http://127.0.0.1:8892/api/us/list/show/"
    }
  },
  methods: {
    initpage () {
      axios.get("http://127.0.0.1:8892/api/us/list/lookup/" + this.$route.query.t).then(res => {
        this.article = res.data
      })
    },
    addCmooent () {
      if (this.text.context == '') {
        this.$message.error("can not be empty !")
        return
      }
      axios.post("http://127.0.0.1:8892/api/comment/list/add", this.text).then(res => {
        this.text.context = ""
      }).finally(() => {
        this.initpage()
      })
    }
  }
}

</script>

<style scoped lang="css">
.main-input {
  margin-top: 4%;
}

h2,
p {
  color: white;
}

h2 {
  text-align: center;
}

p {
  margin-left: 10%;
}

li {
  color: white;
}

ul {
  list-style: none;
}

.logA {
  color: #fff;
  text-align: center;
  background-color: #bc39bf;
  background-image: linear-gradient(to right, #6314ba, #bf3ac0);
}

.logA:hover {
  background-image: linear-gradient(to right, #bf3ac0, #6314ba);
}

.main-box {
  width: 50%;
  margin: 0 auto;
  margin-top: 10%;
  padding-bottom: 1%;
}

/deep/.el-textarea__inner {
  color: white;
  background-color: #171921;
  height: 100%;
}

.main-comment {
  margin-top: 20px;
}

span {
  text-align: left;
  color: gray;
  font-size: 10px;
}

</style>
