<template>
  <div>
    <main>
      <section style="padding-top: 81px" class="latest-news">
        <h2>Latest News</h2>
        <div style="overflow: auto">

          <a v-for="item in latestnews" class="news-article">
            <div style="display: flex">
              <div style="flex: 2;text-align: center">
                <div style="padding-top: 50%;color: white;">date:{{ getDate(item.pub_date) }}</div>
              </div>
              <div style="flex: 5">
                <h2 style="font-weight: bold">{{ item.headline.main }}</h2>
                <p style="font-size: 20px;color: gray">{{ item.lead_paragraph }}</p>
                <a :href="item.web_url" class="logA" style="color: #6016b2;border-radius: 17px;">-->Read More</a>
              </div>
              <div style="flex: 0.5"></div>
              <div style="flex: 3">
                <img style="width: 230px;height: 200px" :src="item.imgUrl" :alt="item.headline.main">
              </div>
            </div>
            <div style="height: 15px;"></div>
          </a>
        </div>
      </section>

    </main>

  </div>
</template>
<script>
import axios from "axios"

import AliFooter from '../../components/footer.vue'
import AliHeader from '../../components/header.vue'
export default {
  components: {
    AliFooter,
    AliHeader
  },
  mounted () {
    this.toSeach()
  },
  data () {
    let data = new Date()
    return {
      latestnews: [],
      begin_date: `${data.getFullYear()}${((data.getMonth() + 1) > 9 ? data.getMonth() + 1 : `0${data.getMonth() + 1}`)}${data.getDate()}`,
      baseUrl: "https://static01.nyt.com/"
    }
  },
  methods: {
    toSeach () {
      axios.get(`https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&begin_date=${this.begin_date - 1}&sort=newest&api-key=px6BIxzgpaYR16UhHTsCHrYOy2xhPMJD`).then(res => {
        this.latestnews = this.mostRead = res.data.response.docs.map(item => {
          item.imgUrl = this.baseUrl + item.multimedia[0]?.url
          return item
        })
      })
    },
    getDate (str) {
      let date = new Date(str)
      // return `${d.getFullYear()}/${d.getMonth()}/${d.getDate()} ${d.getHours()}:${d.getMinutes()}:${d.getMilliseconds()}`
      return date.toLocaleString('en-US', { timeZone: 'America/New_York' })
    }
  }
}

</script>

<style scoped lang="css">
/* Global Styles */
h2 {
  color: white;
}

body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}

a {
  color: #333;
  text-decoration: none;
}

button,
.button {
  background-color: #333;
  border: none;
  color: #fff;
  cursor: pointer;
  padding: 10px 20px;
  transition: background-color 0.3s ease;
}

button:hover,
.button:hover {
  background-color: #555;
}

/* Header Styles */
/* header {
    background-color: #fff;
    border-bottom: 1px solid #ccc;
    display: flex;
    justify-content: space-between;
    padding: 20px;
  }
  
  .logo {
    flex-basis: 20%;
    text-align: center;
  }
  
  .logo img {
    height: 60px;
    width: auto;
  }
  
  nav {
    flex-basis: 80%;
    text-align: right;
  }
  
  nav ul {
    list-style: none;
    margin: 0;
    padding: 0;
  }
  
  nav li {
    display: inline-block;
    margin-left: 20px;
  }
  
  nav a {
    display: block;
    padding: 10px 20px;
  }
  
  nav a:hover {
    background-color: #f1f1f1;
  }
   */
/* Main Styles */
main {
  max-width: 1200px;
  margin: 0 auto;
  padding: 20px;
}

.featured-article {
  margin-bottom: 40px;
  position: relative;
}

.featured-article img {
  width: 20%;
}

.featured-article h2 {
  background-color: #030303;
  font-size: 24px;
  margin: 0;
  padding: 20px;
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
}

.featured-article p {
  margin-top: 20px;
}

.latest-news {
  flex-wrap: wrap;
  justify-content: space-between;
}

.news-article {
  display: flex;
  flex-wrap: wrap;
  background-color: rgb(0, 0, 0);
  border-radius: 5px;
  box-shadow: 0 3px 6px rgba(19, 19, 19, 0.1);
  margin-bottom: 20px;
  overflow: hidden;
  /*width: 30%;*/
  width: 100%;
  /* height: 200px; */
  /**/
  background-color: #171921;
  border-radius: 0px;
  border-bottom: 1px silver solid
}

.news-article img {
  float: left;
  margin-right: 20px;
  width: 40%;
}

.article-content {
  padding: 20px;
}

.article-content h3 {
  margin-top: 0;
}

/* Footer Styles */
footer {
  background-color: #333;
  color: #fff;
  padding: 20px;
  text-align: center;
}

footer p {
  margin: 0;
}

/*   
  @media screen and (max-width: 768px) {
    .logo {
      flex-basis: 40%;
    }
    
    nav {
      flex-basis: 60%;
    }
    
    .latest-news .news-article {
      width: 48%;
    }
  }
   */


/*general*/

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
</style>
