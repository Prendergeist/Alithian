<template>
  <div>

    <div class="container">

      <el-form :model="from" ref="fromRulesRef" :rules="fromRules">
        <h2>Register as an Alithian</h2>
        <br>
      <el-form-item  prop="email" label="Email Address:">
          <el-input v-model="from.email" placeholder="Enter your email" />

      </el-form-item>
          <el-form-item prop="password" label="Password:">
              <el-input type="password" v-model="from.password" />
          </el-form-item>


          <el-form-item prop="confirmpassword" label="Confirm Password:">
              <el-input type="password" v-model="from.confirmpassword"/>
          </el-form-item>



        <el-button class="logA" @click="register" type="register-button" id="register-button">Register</el-button>

      </el-form>

      <div id="error-message"></div>
      <div id="success-message"></div>
    </div>

  </div>
</template>
<script>
import AliFooter from '../../components/footer.vue'
import AliHeader from '../../components/header.vue'
import axios from 'axios'
export default {
  components: {
    AliFooter,
    AliHeader
  },
  data () {

      var validateconfirmPwd = (rule, value, callback) => {

          if (value === '') {
              callback(new Error('please enter your password again'));
          } else if (value !== this.from.password) {
              callback(new Error('different password'));
          } else {
              callback();
          }
      };
      return {
      from: {
        password: "",
        email: "",
        confirmpassword: ""
      },
        fromRules:{
            email: [
                { required: true, message: 'email can not be empty', trigger: 'blur' },
                { type: 'email', message: 'please enter correct email', trigger: ['blur', 'change'] }
            ],
            password: [
                { required: true, message: 'password can not be empty', trigger: 'blur' },
            ],
            confirmpassword: [
                { required: true, message: 'password can not be empty', trigger: 'blur' },
                { validator: validateconfirmPwd, trigger: 'blur' }
            ],
        }
    }
  },
  methods: {
    register () {
      this.$refs["fromRulesRef"].validate((res=>{
          if(res){
              axios.post('http://127.0.0.1:8892/api/user/list/add', this.from).then(res => {
                  if (res.data) {
                      this.$message({ message: 'register successful', type: 'success' })
                      this.$router.push("sigin")
                  }
              }).catch(() => {
                  this.$message({ message: 'user has been exist', type: 'error' })
              })
          }
      }))


      }
  }
}

</script>

<style scoped lang="css">
@import '../../assets/css/register.css';
@import '../../assets/css/index.css';

.logA {
  color: #fff;
  text-align: center;
  background-color: #bc39bf;
  background-image: linear-gradient(to right, #6314ba, #bf3ac0);
}

.logA:hover {
  background-image: linear-gradient(to right, #bf3ac0, #6314ba);
}

@media screen and (min-width:1680px) {
  .logA {
    padding: 8px 22px;
    height: 40px;
    line-height: 40px;
  }

  .logA:hover {}
}
</style>
