<template>
  <div>
    <div v-if="tag" class="mycontainer">
      <div class="myleft">
        <div>
          <h1 style="color: white;padding-left: 25px;">Write for Us</h1>
          <h2 style="color: white;padding-left: 25px;">Seeking articles for publication</h2>
          <p style="color: white;padding-left: 25px;">
            Are you an aspiring journalist? An ambitious writer who wants an audience? Do you have an unusual viewpoint on
            political matters or a unique perspective on popular culture? Did you complete a project you are proud of, and
            want to share the story?
            If so, we want to publish your work.
            Alithia is an independent media channel, covering a diverse array of topics. Our very name is taken from the
            Greek word for “truth.” Accordingly, we are not taking money to serve as a forum for corporate interests.
            You are encouraged to have a look at the articles on the Alithia website to get an idea of the content we’re
            looking for. If you’d like to publish an article with us, please read the guidelines provided below.</p>
              <h2 style="color: white;padding-left: 25px;">
                  Topics we will consider for publication on Alithia:</h2>
            <p style="color: white;padding-left: 25px;">
            Current news stories in politics, domestic and global; business news; social commentary; opinion essays;
            topics in popular media; science and nature, healthcare and medicine; personal development; fitness and
            nutrition; spiritual explorations; travelogs; culinary adventures; creative writing such as science fiction,
                and more.</p>
            <h2 style="color: white;padding-left: 25px;">Article guidelines:</h2>
            <p style="color: white;padding-left: 25px;">
            Articles can be of any length, but brevity is the soul of wit. Consider the message you are trying to convey,
            and how much you can get across in an economy of words.
            You may format the article with bold, italics, and underlines. You are allowed to use special characters.
            Please no color fonts.
            We recommend a gripping title for your article. If it is insufficiently riveting, the Alithian editors may
            change it.
            In addition to a title, subheadings are encouraged to organize your subject.
            You may submit images along with your article, or request that the Alithian editors choose one that fits the
            topic. We ask that if you submit an image, you also provide the url of the website where you found it, [and a
            brief statement of why it is relevant to the article.]
            The Alithian editors reserve the right to edit a submitted article, or substitute a more appropriate image to
            accompany the article.
            As we are seeking original material, we discourage plagiarizing. We will scan submitted articles using
            software to identify content that is not your own writing. You may, however, submit original articles you’ve
            published on your own personal blog or social media platform, with a link to your website or platform.
            Articles may not be in pdf or html format. Submitted articles must be written in Word or Google docs. Please
            be sure to enable editing when submitting a Google doc.
          </p>
        </div>


        <div>
          <h2 style="color: white;padding-left: 25px;">Link policy</h2>
          <p style="color: white;padding-left: 25px;">
            You may include links in your article to reference websites, podcasts, blogs, vlogs, YouTube videos or other
            media that supports the content of your article. For example, if you are writing on a science topic, you are
            encouraged to include links to sites that contain material related to that topic, or provide background
            information to help your audience understand the topic.
            You may also include links in your author bio, such as LinkedIn page, or personal website.
            There will be absolutely no links to offensive content. Links to pornography or hate groups will immediately
            disqualify your article for publication.
          </p>
              <h2 style="color: white;padding-left: 25px;">In order to submit your article:</h2>
            <p style="color: white;padding-left: 25px;">
            Please ensure you have satisfied the guidelines for publication (above). Articles that do not conform to style
            or formatting requirements will be returned with a request for corrections, or rejected.
            Please submit your completed draft in Word or Google docs, with author bio and the email address you used when
            you registered as an Alithian. Please enable editing for your submission.
            Your author bio may not be more than one paragraph. Please include first and last name in the bio. Links to
            your personal website or other social media are permitted. Please also include a current profile picture for
                your author bio.</p>

            <h2 style="color: white;padding-left: 25px;">Thank you for reading and agreeing to conform to our guidelines.</h2>
            <p style="color: white;padding-left: 25px;">
            We are looking forward to reading and publishing your work.
          </p>
          <div style="margin-left: 10%;">
            <h2 style="color: white;">Submission Form</h2>
            <el-form ref="form" :model="form" style="height: 500px;" label-width="80px">
              <div style="height: 5px;"></div>
              <el-form-item label="Title">
                <el-input style="width: 90%;" v-model="form.name"></el-input>
              </el-form-item>
              <el-form-item label="Email">
                <el-input style="width: 90%;" v-model="form.email"></el-input>
              </el-form-item>
              <el-form-item label="article:">
                <el-input style="width: 90%;" :rows="7" type="textarea" placeholder="Pitch or Full Article:"
                  v-model="form.article"></el-input>
              </el-form-item>
              <el-upload style="height: 100px;" class="upload-demo" :file-list="fileList"
                action="http://127.0.0.1:8892/api/us/list/upload" :on-change="fileUpload">
                <el-button size="lager" type="primary">Select File</el-button>
                <div slot="tip" class="el-upload__tip">jpg/png file only，less than 500kb</div>
              </el-upload>
              <el-button @click="addArticle">SUBMIT</el-button>
              <div style="height: 5px;"></div>
            </el-form>
          </div>
        </div>
      </div>

    </div>


  </div>
</template>
<script>

import axios from 'axios';
import AliFooter from '../../components/footer.vue'
import AliHeader from '../../components/header.vue'
export default {
  components: {
    AliFooter,
    AliHeader
  },
  data () {
    return {
      tag: true,
      form: {
        url: "",
        name: "",
        email: "",
        article: "",
        uid: JSON.parse(localStorage.getItem("INFO"))?.id || null
      },
      fileList: [],
      details: {},
      datalist: [],
      baseUrl: "http://127.0.0.1:8892/api/us/list/show/"
    }
  },
  mounted () {

    if (!localStorage.getItem("INFO")) {
      this.$confirm('you need to login', 'hint', {
        confirmButtonText: 'confirm',
        cancelButtonText: 'cancel',
        type: 'warning'
      }).then(() => { }).finally(() => {
        this.$router.push("sigin")
      })
    } else {
      this.initPages()
    }

  },
  methods: {
    fileUpload (file, filelist) {
      if (!this.beforeAvatarUpload(file)) return
      this.fileList.push({ name: file.name, url: "" })
      let data = new FormData()
      data.append('file', file.raw)
      axios.post("http://127.0.0.1:8892/api/us/list/upload", data, {
        headers: {
          contentType: "multipart/form-data;"
        }
      }).then(res => this.form.url = res.data)
    },
    beforeAvatarUpload (file) {
      const isJPG = file.raw.type === 'image/jpeg';
      if (!isJPG) {
        this.$message.error('image only be JPG format');
      }
      return isJPG
    },

    addArticle () {
      if (!this.form.uid) {
        this.$confirm('you need to login', 'hint', {
          confirmButtonText: 'confirm',
          cancelButtonText: 'cancel',
          type: 'warning'
        }).then(() => { }).finally(() => {
          this.$router.push("sigin")
        })
        return
      } else {
        axios.post("http://127.0.0.1:8892/api/us/list/add", this.form).then(res => {
          this.$message.success('add successful');
        }).catch(error => {
          this.$message.error('add fail');
        }).finally(() => {
          this.form.name = ''
          this.form.url = ''
          this.form.email = ''
          this.form.article = ''
          this.form.fileList = []
        })
      }
    },
    initPages () {
      if (!this.form.uid) {
        this.$confirm('Need to login', 'hint', {
          confirmButtonText: 'confirm',
          cancelButtonText: 'cancel',
          type: 'warning'
        }).then(() => { }).finally(() => {
          this.$router.push("sigin")
        })
        return
      } else {
        axios.get(`http://127.0.0.1:8892/api/us/list/pages?uid=${this.form.uid}`).then(res => {
          this.datalist = res.data.map(item => {
            item.url = this.baseUrl + item.url
            return item
          })
        })
      }
    },
    todetails (item) {
      this.tag = false
      this.details = JSON.parse(JSON.stringify(item))
    }
  }
}

</script>
<style lang="css" scoped>
.mycontainer {
  margin-top: 125px;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
}

.myleft,
.myright {
  background-color: #3b3b3b;
  border-radius: 16px;
  width: 40%;
  height: 100%;
}


.myleft p {
  font-size: 16px;
  line-height: 1.5;
  margin-bottom: 30px;
  justify: center;
}

.el-form {
  background-color: #3b3b3b;
}
</style>