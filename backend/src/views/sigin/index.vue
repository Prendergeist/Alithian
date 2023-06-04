<template>
  <div>
    <div class="container">
      <el-form :model="from">
        <h2>Login</h2>
        <br>
        <label for="email">Email:</label>
        <input v-model="from.email" type="email" id="email-input" name="email" placeholder="Enter your email" required>
        <label for="password">Password:</label>
        <input v-model="from.password" type="password" id="password-input" name="password"
          placeholder="Enter your password" required>
        <el-button style="line-height: 26px;" class="logA" @click="login">Login</el-button>
        <img src="../../assets/image/istockphoto-1145046836-612x612.jpg" alt="Example Image">
      </el-form>
      <div id="error-message"></div>
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
    return {
      from: {
        password: "",
        email: "",
      }
    }
  },
  methods: {
    login () {
      if (!this.from.email || !this.from.password) {
        this.$message({ message: 'email or password is empty', type: 'error' })

        return
      }
      axios.post('http://127.0.0.1:8892/api/user/list/login', this.from).then(res => {
        if (res.data) {
          localStorage.setItem("INFO", JSON.stringify(res.data))
          this.$message({ message: 'login', type: 'success' })
          this.$router.push("home")
        }else {
            this.$message({ message: 'username or password error', type: 'error' })
        }
      })
    }
  }
}

</script>

<style scoped lang="css">
/*general*/


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
    line-height: 25px;
  }

  .logA:hover {}
}

* {
  margin: 0;
  padding: 0;
}

*,
::after,
::before {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

html {}

body {
  margin: 0;
  color: #fff;
  position: relative;
  font-family: "microsoft yahei", "Arial", sans-serif;
  font-size: 12px;
  background-color: #171921;
  word-break: break-word;
  min-width: 1200px;
}

ul,
li,
p,
h1,
h2,
h3,
h4,
h5,
h6,
dl,
dt,
dd {
  margin: 0px;
  padding: 0px;
  border: none;
  list-style: none;
  font-weight: normal;
}

a {
  text-decoration: none;
  text-shadow: none;
  font-weight: normal;
  outline: none;
  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
  -webkit-tap-highlight-color: transparent;
}

ul {
  list-style: none;
}

textarea,
input,
button,
select {
  outline: none;
  -webkit-appearance: none;
  font-family: Arial, Helvetica, sans-serif;
}

a {
  color: #2c2c2c;
  text-decoration: none;
}

img {
  border: none;
  display: block;
  max-width: 100%;
}

span {
  margin: 0;
  padding: 0;
  cursor: auto;
}

span:focus,
div:focus {
  outline: none;
}

button {
  border: none;
  background-color: transparent;
  cursor: pointer;
}

.flex {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  flex-wrap: wrap;
  align-items: flex-start;
}

.flexC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  align-items: center;
  flex-wrap: wrap;
}

.fl-bet {
  -webkit-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.fl-cen {
  -webkit-box-pack: center;
  -ms-flex-pack: center;
  justify-content: center;
}

.fl-end {
  -webkit-box-pack: right;
  -ms-flex-pack: right;
  justify-content: flex-end;
}

.ward {
  width: 86%;
  margin: 0 auto;
  max-width: 1640px;
}

.br4 {
  border-radius: 4px;
}

.br6 {
  border-radius: 6px;
}

.br8 {
  border-radius: 8px;
}

.overF {
  overflow: hidden;
}

.mrL {
  margin-left: auto
}


/*header*/
.header {
  background-color: #20222a;
}

.hdK {
  width: 86%;
  margin: 0 auto;
  position: relative;
}

.hdK:after {
  position: absolute;
  content: '';
  left: 0;
  right: 0;
  margin: 0 auto;
  border-bottom: 0 solid transparent;
  z-index: 1
}

.nav {}

.nav ul li {}

.nav ul li:last-child {
  margin-right: 0;
}

.menuA {
  color: #676767;
  transition: color 0.3s;
  -webkit-transition: color 0.3s;
}

.menuA:hover,
.menuA.active {
  color: #fff;
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

.hd-logo {
  position: absolute;
  left: 0;
  right: 0;
  margin: 0 auto;
  top: 0;
  z-index: 2;
}

/*footer*/
.footer {
  background-color: #20222a;
}

.ftK {
  width: 86%;
  margin: 0 auto;
  height: 100%;
}

.ft-logo {}

.ft-l-nav {}

.ft-nav-a {
  color: #838383;
  display: block;
  line-height: 1.7;
  transition: color 0.3s;
  -webkit-transition: color 0.3s;
}

.ft-nav-a:hover {
  color: #fff;
}

.footer .copy {
  color: #a4a4a4;
}

.footer .copy span {}

.footer .links {}

.footer .links a {
  overflow: hidden;
  background-color: #444751;
}

.footer .links a:last-child {
  margin-right: 0;
}

.footer .links a img {
  margin: 0 auto;
}

@media screen and (min-width:1680px) {

  /*header*/
  .header {
    height: 73px;
    border-top: 7px solid #4b1c73;
  }

  .hdK {
    height: 66px;
  }

  .hdK:after {
    top: 66px;
    width: 225px;
    height: 225px;
    border-left: 127px solid transparent;
    border-top: 127px solid #20222a;
    border-right: 127px solid transparent;
  }

  .nav {
    font-size: 18px
  }

  .nav ul li {
    margin-right: 50px;
  }

  .nav ul li:last-child {}

  .menuA {}

  .menuA:hover,
  .menuA.active {}

  .logA {
    padding: 8px 22px;
    height: 40px;
    line-height: 40px;
  }

  .logA:hover {}

  .hd-logo {
    width: 114px;
  }

  /*footer*/
  .footer {
    height: 128px;
  }

  .ftK {}

  .ft-logo {
    width: 97px;
  }

  .ft-l-nav {
    margin-left: 44px;
  }

  .ft-nav-a {
    font-size: 16px;
  }

  .ft-nav-a:hover {}

  .footer .copy {
    font-size: 14px;
  }

  .footer .copy span {
    margin-left: 30px;
  }

  .footer .links {}

  .footer .links a {
    width: 26px;
    height: 26px;
    border-radius: 4px;
    margin-right: 24px;
  }

  .footer .links a:last-child {}

  .footer .links a img {
    width: 24px;
  }
}

@media screen and (max-width:1679px) and (min-width:1440px) {

  /*header*/
  .header {
    height: 73px;
    border-top: 7px solid #4b1c73;
  }

  .hdK {
    height: 66px;
  }

  .hdK:after {
    top: 66px;
    width: 225px;
    height: 225px;
    border-left: 127px solid transparent;
    border-top: 127px solid #20222a;
    border-right: 127px solid transparent;
  }

  .nav {
    font-size: 18px
  }

  .nav ul li {
    margin-right: 50px;
  }

  .nav ul li:last-child {}

  .menuA {}

  .menuA:hover,
  .menuA.active {}

  .logA {
    padding: 8px 22px;
    height: 40px;
    line-height: 40px;
  }

  .logA:hover {}

  .hd-logo {
    width: 114px;
  }

  /*footer*/
  .footer {
    height: 128px;
  }

  .ftK {}

  .ft-logo {
    width: 97px;
  }

  .ft-l-nav {
    margin-left: 44px;
  }

  .ft-nav-a {
    font-size: 16px;
  }

  .ft-nav-a:hover {}

  .footer .copy {
    font-size: 14px;
  }

  .footer .copy span {
    margin-left: 30px;
  }

  .footer .links {}

  .footer .links a {
    width: 26px;
    height: 26px;
    border-radius: 4px;
    margin-right: 24px;
  }

  .footer .links a:last-child {}

  .footer .links a img {
    width: 24px;
  }
}

@media screen and (max-width:1439px) and (min-width:1280px) {

  /*header*/
  .header {
    height: 73px;
    border-top: 7px solid #4b1c73;
  }

  .hdK {
    height: 66px;
  }

  .hdK:after {
    top: 66px;
    width: 225px;
    height: 225px;
    border-left: 127px solid transparent;
    border-top: 127px solid #20222a;
    border-right: 127px solid transparent;
  }

  .nav {
    font-size: 16px;
  }

  .nav ul li {
    margin-right: 40px;
  }

  .nav ul li:last-child {}

  .menuA {}

  .menuA:hover,
  .menuA.active {}

  .logA {
    padding: 8px 22px;
    height: 40px;
    line-height: 40px;
  }

  .logA:hover {}

  .hd-logo {
    width: 114px;
  }

  /*footer*/
  .footer {
    height: 108px;
  }

  .ftK {}

  .ft-logo {
    width: 87px;
  }

  .ft-l-nav {
    margin-left: 44px;
  }

  .ft-nav-a {
    font-size: 14px;
  }

  .ft-nav-a:hover {}

  .footer .copy {
    font-size: 12px;
  }

  .footer .copy span {
    margin-left: 30px;
  }

  .footer .links {}

  .footer .links a {
    width: 24px;
    height: 24px;
    border-radius: 4px;
    margin-right: 24px;
  }

  .footer .links a:last-child {}

  .footer .links a img {
    width: 22px;
  }
}

@media screen and (max-width:1280px) {

  /*header*/
  .header {
    height: 73px;
    border-top: 7px solid #4b1c73;
  }

  .hdK {
    height: 66px;
  }

  .hdK:after {
    top: 66px;
    width: 225px;
    height: 225px;
    border-left: 127px solid transparent;
    border-top: 127px solid #20222a;
    border-right: 127px solid transparent;
  }

  .nav {
    font-size: 16px;
  }

  .nav ul li {
    margin-right: 40px;
  }

  .nav ul li:last-child {}

  .menuA {}

  .menuA:hover,
  .menuA.active {}

  .logA {
    padding: 8px 22px;
    height: 40px;
    line-height: 40px;
  }

  .logA:hover {}

  .hd-logo {
    width: 114px;
  }

  /*footer*/
  .footer {
    height: 108px;
  }

  .ftK {}

  .ft-logo {
    width: 87px;
  }

  .ft-l-nav {
    margin-left: 44px;
  }

  .ft-nav-a {
    font-size: 14px;
  }

  .ft-nav-a:hover {}

  .footer .copy {
    font-size: 12px;
  }

  .footer .copy span {
    margin-left: 30px;
  }

  .footer .links {}

  .footer .links a {
    width: 24px;
    height: 24px;
    border-radius: 4px;
    margin-right: 24px;
  }

  .footer .links a:last-child {}

  .footer .links a img {
    width: 22px;
  }
}


















.enlarge img {
  width: 100%;
  transition: 0.5s;
}

.enlarge:hover img {
  -ms-transform: scale(1.05);
  -moz-transform: scale(1.05);
  -webkit-transform: scale(1.05);
  -o-transform: scale(1.05);
  transform: scale(1.05);
  transition: 0.5s;
}

.Mover {
  transition: 0.5s;
  transition: All 0.4s ease-in-out;
  -webkit-transition: All 0.4s ease-in-out;
  -moz-transition: All 0.4s ease-in-out;
  -o-transition: All 0.4s ease-in-out;
}

.Mover:hover {
  transition: 0.5s;
  ransform: translate(0, -10px);
  -webkit-transform: translate(0, -10px);
  -moz-transform: translate(0, -10px);
  -o-transform: translate(0, -10px);
  -ms-transform: translate(0, -10px);
}

.IndChangeTabRight {
  -webkit-animation-name: changeTabRight__1s_Xw;
  animation-name: changeTabRight__1s_Xw;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both;
  -webkit-animation-duration: 0.6s;
  animation-duration: 0.6s;
}

@-webkit-keyframes changeTabRight__1s_Xw {
  0% {
    opacity: 0;
    visibility: hidden;
  }

  to {
    opacity: 1;
    visibility: visible;
  }
}

@keyframes changeTabRight__1s_Xw {
  0% {
    opacity: 0;
    visibility: hidden;
  }

  to {
    opacity: 1;
    visibility: visible;
  }
}

/*conversion：*/
html {
  font-size: 625%;
}


@media screen and (min-width:360px) and (max-width:374px) and (orientation:portrait) {
  html {
    font-size: 703%;
  }
}

@media screen and (min-width:375px) and (max-width:383px) and (orientation:portrait) {
  html {
    font-size: 732.4%;
  }
}

@media screen and (min-width:384px) and (max-width:399px) and (orientation:portrait) {
  html {
    font-size: 750%;
  }
}

@media screen and (min-width:400px) and (max-width:413px) and (orientation:portrait) {
  html {
    font-size: 781.25%;
  }
}

@media screen and (min-width:414px) and (max-width:431px) and (orientation:portrait) {
  html {
    font-size: 808.6%;
  }
}

@media screen and (min-width:432px) and (max-width:479px) and (orientation:portrait) {
  html {
    font-size: 843.75%;
  }
}

#searchbtn {
  cursor: pointer;
}

.search_result {
  text-align: left;
}

.search_result li {
  border-bottom: 1px solid #999;
  padding: 8px 0;
}

.search_result li a {
  color: #eee;
  font-size: 16px;
}

.search_form {
  width: 86%;
  margin: 0 auto;
  text-align: center;
  padding: 20px;
  border: 1px solid #eee;
  margin-top: 15px;
  line-height: 36px;
}

.search_form .keywords {
  border: 0;
  background: #fff;
  padding: 10px 15px;
  font-size: 18px;
  width: 300px;
  height: 36px;
  display: inline-block;
}

.search_form .submit {
  display: inline-block;
  height: 36px;
  border: 0;
  padding: 0px 15px;
  background: #fff;
  vertical-align: middle;
  position: relative;
  top: -2px;
}

/*
display:flex;justify-content:space-between;align-items:center; flex-wrap:wrap;align-content:center
|flex-start|flex-end|center|space-between|space-around

overflow: hidden;text-overflow:ellipsis;white-space: nowrap;
display:-webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 3;overflow: hidden;

transition:0.5s;
.IndEnvT:before,.IndEnvT:after{display:block;content:'';position: absolute;}
*/

body {
  /* font-family: Arial, sans-serif; */
  /* background-color: #f2f2f2; */
}

.container {
  position: relative;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
}

h2 {
  color: black;
}

form {
  max-width: 500px;
  text-align: center;
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
}

label {
  display: block;
  margin-bottom: 5px;
  color: #666;
}


input[type="email"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 3px;
  box-sizing: border-box;
}

button[type="login-button"] {
  display: inline-block;
  margin: 10px;
  padding: 10px 20px;
  border: none;
  border-radius: 3px;
  font-size: 16px;
  font-weight: bold;
  color: #fff;
  background-color: #800080;
  cursor: pointer;
}

button[type="login-button"]:hover {
  background-color: #9932cc;
}

footer {
  background-color: #292929;
  color: #fff;
  text-align: center;
  padding: 20px;
}
</style>
