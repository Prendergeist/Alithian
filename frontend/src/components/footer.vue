<template>
  <div>
    <footer class="footer">
      <div class="ftK flexC fl-bet">
        <div class="ft-l flexC">
          <a href="index.html" class="ft-logo"><img src="../assets/image/hd-logo.png"></a>
          <div class="ft-l-nav">
            <a href="about_us.html" class="ft-nav-a">About us</a>
            <a href="javascript:;" class="ft-nav-a">Join Us</a>
            <a href="javascript:;" class="ft-nav-a">Contact Us</a>
          </div>
        </div>
        <div class="copy">© Copyright 2023 <span>Terms of Use | Privacy Policy</span></div>
        <div class="links flexC">
          <a href="javascript:;" class="flexC"><img src="../assets/image/link01.png"></a>
          <a href="javascript:;" class="flexC"><img src="../assets/image/link02.png"></a>
          <a href="javascript:;" class="flexC"><img src="../assets/image/link03.png"></a>
        </div>
      </div>
    </footer>
  </div>
</template>
<script>
export default {

}

</script>

<style scoped lang="css">
/* @import '../assets/css/swiper.css';
@import '../assets/css/styleindex.css';
@import '../assets/css/index.css'; */


h2 {
  font-size: 28px;
  font-weight: 600;
  line-height: 1.5;
}

h3 {
  font-size: 20px;
  line-height: 1.2
}

h4 {
  font-size: 16px;
  line-height: 1.2
}

.mt-8 {
  margin-top: 8px;
}

.mt-10 {
  margin-top: 10px;
}

.mt-16 {
  margin-top: 16px;
}

.pt-24 {
  padding-top: 24px;
}

/*banner*/
.banner-div-block {}

.banner {}

.banner .next,
.banner .prev {
  color: #fff;
}

.banner .next:after,
.banner .prev:after {}

/*main*/
.main {}

.con {}

.last-con {}

/*tit*/
.tit a {
  color: inherit;
  font-weight: inherit;
}

.tit span {
  border-radius: 50%;
}

.tit span img {
  margin: 0 auto;
}

/*left*/
.Hot-pic {}

.con-nei {}

.Hot-pic img {
  height: 100%;
  object-fit: cover;
}

.text-con {
  color: #fff;
  display: block;
}

.text-con span {
  color: #8c8c8c;
  line-height: 1.5
}

.text-con h3 {
  color: inherit;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.text-con p {
  color: #b1b1b1;
  line-height: 1.5;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.y-line {
  background-color: #333439;
}

/*center*/
.text-con-cen {}

.text-con-cen:last-child {
  padding-bottom: 0;
  border-bottom: none;
  margin-bottom: 0
}

.text-con-cen .time {}

.text-con-cen .time i {
  text-align: center;
  font-style: normal;
}

/*right*/
.con-nei .items {}

.con-nei .items:last-child {
  margin-bottom: 0;
}

.con-nei .items .item-a {
  color: #fff;
}

.con-nei .items .item-a .text {}

.con-nei .items .item-a .text h4 {
  color: inherit;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.con-nei .items .item-a .text p {
  color: #7c7c7c;
  line-height: 1.5;
  display: -webkit-box;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.news-pic {
  overflow: hidden;
}

.news-pic img {
  height: 100%;
  object-fit: cover;
}

@media screen and (min-width:1680px) {

  /*banner*/
  .banner-div-block {
    margin-top: 30px;
  }

  .banner {}

  .banner .next,
  .banner .prev {}

  .banner .next:after,
  .banner .prev:after {
    font-size: 20px;
  }

  /*main*/
  .main {
    padding: 20px 0 36px;
  }

  .con {
    width: 31%
  }

  .last-con {
    width: 32.6%
  }

  /*tit*/
  .tit a {}

  .tit span {
    width: 18px;
    height: 18px;
    border: 1px solid #fff;
    margin-left: 18px;
    margin-top: 5px;
  }

  .tit span img {
    width: 12px;
  }

  /*left*/
  .Hot-pic {
    height: 344px;
  }

  .con-nei {
    margin-top: 14px;
  }

  .Hot-pic img {}

  .text-con {}

  .text-con span {
    font-size: 14px;
  }

  .text-con h3 {
    -webkit-line-clamp: 2;
  }

  .text-con p {
    font-size: 16px;
    -webkit-line-clamp: 2;
  }

  .y-line {
    width: 1px;
    height: 550px;
    margin: 10px 1.3%;
  }

  /*center*/
  .text-con-cen {
    padding-bottom: 16px;
    border-bottom: 1px solid #333439;
    margin-bottom: 16px;
  }

  .text-con-cen:last-child {}

  .text-con-cen .time {}

  .text-con-cen .time i {
    margin-right: 14px;
    height: 28px;
    line-height: 28px;
    padding: 0 15px;
    border: 1px solid #717277;
    border-radius: 4px;
    font-size: 14px;
  }

  /*right*/
  .con-nei .items {
    margin-bottom: 28px;
  }

  .con-nei .items:last-child {}

  .con-nei .items .item-a {}

  .con-nei .items .item-a .text {
    width: 71%
  }

  .con-nei .items .item-a .text h4 {}

  .con-nei .items .item-a .text p {
    font-size: 12px;
    -webkit-line-clamp: 2;
  }

  .news-pic {
    height: 78px;
    width: 21%;
  }

  .news-pic img {}
}

@media screen and (max-width:1679px) and (min-width:1440px) {

  /*banner*/
  .banner-div-block {
    margin-top: 30px;
  }

  .banner {}

  .banner .next,
  .banner .prev {}

  .banner .next:after,
  .banner .prev:after {
    font-size: 20px;
  }

  /*main*/
  .main {
    padding: 20px 0 36px;
  }

  .con {
    width: 31%
  }

  .last-con {
    width: 32.6%
  }

  /*tit*/
  .tit a {}

  .tit span {
    width: 18px;
    height: 18px;
    border: 1px solid #fff;
    margin-left: 18px;
    margin-top: 5px;
  }

  .tit span img {
    width: 12px;
  }

  /*left*/
  .Hot-pic {
    height: 344px;
  }

  .con-nei {
    margin-top: 14px;
  }

  .Hot-pic img {}

  .text-con {}

  .text-con span {
    font-size: 14px;
  }

  .text-con h3 {
    -webkit-line-clamp: 2;
  }

  .text-con p {
    font-size: 16px;
    -webkit-line-clamp: 2;
  }

  .y-line {
    width: 1px;
    height: 550px;
    margin: 10px 1.3%;
  }

  /*center*/
  .text-con-cen {
    padding-bottom: 16px;
    border-bottom: 1px solid #333439;
    margin-bottom: 16px;
  }

  .text-con-cen:last-child {}

  .text-con-cen .time {}

  .text-con-cen .time i {
    margin-right: 14px;
    height: 28px;
    line-height: 28px;
    padding: 0 15px;
    border: 1px solid #717277;
    border-radius: 4px;
    font-size: 14px;
  }

  /*right*/
  .con-nei .items {
    margin-bottom: 28px;
  }

  .con-nei .items:last-child {}

  .con-nei .items .item-a {}

  .con-nei .items .item-a .text {
    width: 71%
  }

  .con-nei .items .item-a .text h4 {}

  .con-nei .items .item-a .text p {
    font-size: 12px;
    -webkit-line-clamp: 2;
  }

  .news-pic {
    height: 78px;
    width: 21%;
  }

  .news-pic img {}
}

@media screen and (max-width:1439px) and (min-width:1280px) {
  h2 {
    font-size: 26px;
  }

  h3 {
    font-size: 16px;
  }

  h4 {
    font-size: 16px;
  }

  .mt-8 {
    margin-top: 8px;
  }

  .mt-10 {
    margin-top: 10px;
  }

  .mt-16 {
    margin-top: 16px;
  }

  .pt-24 {
    padding-top: 24px;
  }

  /*banner*/
  .banner-div-block {
    margin-top: 30px;
  }

  .banner {}

  .banner .next,
  .banner .prev {}

  .banner .next:after,
  .banner .prev:after {
    font-size: 20px;
  }

  /*main*/
  .main {
    padding: 20px 0 36px;
  }

  .con {
    width: 31%
  }

  .last-con {
    width: 32.6%
  }

  /*tit*/
  .tit a {}

  .tit span {
    width: 16px;
    height: 16px;
    border: 1px solid #fff;
    margin-left: 18px;
    margin-top: 5px;
  }

  .tit span img {
    width: 10px;
  }

  /*left*/
  .Hot-pic {
    height: 310px;
  }

  .con-nei {
    margin-top: 14px;
  }

  .Hot-pic img {}

  .text-con {}

  .text-con span {
    font-size: 12px;
  }

  .text-con h3 {
    -webkit-line-clamp: 2;
  }

  .text-con p {
    font-size: 14px;
    -webkit-line-clamp: 2;
  }

  .y-line {
    width: 1px;
    height: 510px;
    margin: 10px 1.3%;
  }

  /*center*/
  .text-con-cen {
    padding-bottom: 16px;
    border-bottom: 1px solid #333439;
    margin-bottom: 16px;
  }

  .text-con-cen:last-child {}

  .text-con-cen .time {}

  .text-con-cen .time i {
    margin-right: 14px;
    height: 26px;
    line-height: 26px;
    padding: 0 13px;
    border: 1px solid #717277;
    border-radius: 4px;
    font-size: 12px;
  }

  /*right*/
  .con-nei .items {
    margin-bottom: 28px;
  }

  .con-nei .items:last-child {}

  .con-nei .items .item-a {}

  .con-nei .items .item-a .text {
    width: 71%
  }

  .con-nei .items .item-a .text h4 {}

  .con-nei .items .item-a .text p {
    font-size: 12px;
    -webkit-line-clamp: 2;
  }

  .news-pic {
    height: 68px;
    width: 21%;
  }

  .news-pic img {}
}

@media screen and (max-width:1280px) {
  h2 {
    font-size: 26px;
  }

  h3 {
    font-size: 16px;
  }

  h4 {
    font-size: 16px;
  }

  .mt-8 {
    margin-top: 8px;
  }

  .mt-10 {
    margin-top: 10px;
  }

  .mt-16 {
    margin-top: 16px;
  }

  .pt-24 {
    padding-top: 24px;
  }

  /*banner*/
  .banner-div-block {
    margin-top: 30px;
  }

  .banner {}

  .banner .next,
  .banner .prev {}

  .banner .next:after,
  .banner .prev:after {
    font-size: 20px;
  }

  /*main*/
  .main {
    padding: 20px 0 36px;
  }

  .con {
    width: 31%
  }

  .last-con {
    width: 32.6%
  }

  /*tit*/
  .tit a {}

  .tit span {
    width: 16px;
    height: 16px;
    border: 1px solid #fff;
    margin-left: 18px;
    margin-top: 5px;
  }

  .tit span img {
    width: 10px;
  }

  /*left*/
  .Hot-pic {
    height: 310px;
  }

  .con-nei {
    margin-top: 14px;
  }

  .Hot-pic img {}

  .text-con {}

  .text-con span {
    font-size: 12px;
  }

  .text-con h3 {
    -webkit-line-clamp: 2;
  }

  .text-con p {
    font-size: 14px;
    -webkit-line-clamp: 2;
  }

  .y-line {
    width: 1px;
    height: 510px;
    margin: 10px 1.3%;
  }

  /*center*/
  .text-con-cen {
    padding-bottom: 16px;
    border-bottom: 1px solid #333439;
    margin-bottom: 16px;
  }

  .text-con-cen:last-child {}

  .text-con-cen .time {}

  .text-con-cen .time i {
    margin-right: 14px;
    height: 26px;
    line-height: 26px;
    padding: 0 13px;
    border: 1px solid #717277;
    border-radius: 4px;
    font-size: 12px;
  }

  /*right*/
  .con-nei .items {
    margin-bottom: 28px;
  }

  .con-nei .items:last-child {}

  .con-nei .items .item-a {}

  .con-nei .items .item-a .text {
    width: 71%
  }

  .con-nei .items .item-a .text h4 {}

  .con-nei .items .item-a .text p {
    font-size: 12px;
    -webkit-line-clamp: 2;
  }

  .news-pic {
    height: 68px;
    width: 21%;
  }

  .news-pic img {}
}

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
    top: 46px;
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
    top: 46px;
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
    top: 46px;
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
    top: 46px;
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
/**
 * Swiper 5.3.1
 * Most modern mobile touch slider and framework with hardware accelerated transitions
 * http://swiperjs.com
 *
 * Copyright 2014-2020 Vladimir Kharlampidi
 *
 * Released under the MIT License
 *
 * Released on: February 8, 2020
 */

@font-face {
  font-family: 'swiper-icons';
  src: url("data:application/font-woff;charset=utf-8;base64, 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") format("woff");
  font-weight: 400;
  font-style: normal;
}

:root {
  --swiper-theme-color: #6f6f6f;
}

.swiper-container {
  margin-left: auto;
  margin-right: auto;
  position: relative;
  overflow: hidden;
  list-style: none;
  padding: 0;
  /* Fix of Webkit flickering */
  z-index: 1;
}

.swiper-container-vertical>.swiper-wrapper {
  flex-direction: column;
}

.swiper-wrapper {
  position: relative;
  width: 100%;
  height: 100%;
  z-index: 1;
  display: flex;
  transition-property: transform;
  box-sizing: content-box;
}

.swiper-container-android .swiper-slide,
.swiper-wrapper {
  transform: translate3d(0px, 0, 0);
}

.swiper-container-multirow>.swiper-wrapper {
  flex-wrap: wrap;
}

.swiper-container-multirow-column>.swiper-wrapper {
  flex-wrap: wrap;
  flex-direction: column;
}

.swiper-container-free-mode>.swiper-wrapper {
  transition-timing-function: ease-out;
  margin: 0 auto;
}

.swiper-slide {
  flex-shrink: 0;
  width: 100%;
  height: 100%;
  position: relative;
  transition-property: transform;
}

.swiper-slide-invisible-blank {
  visibility: hidden;
}

/* Auto Height */
.swiper-container-autoheight,
.swiper-container-autoheight .swiper-slide {
  height: auto;
}

.swiper-container-autoheight .swiper-wrapper {
  align-items: flex-start;
  transition-property: transform, height;
}

/* 3D Effects */
.swiper-container-3d {
  perspective: 1200px;
}

.swiper-container-3d .swiper-wrapper,
.swiper-container-3d .swiper-slide,
.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom,
.swiper-container-3d .swiper-cube-shadow {
  transform-style: preserve-3d;
}

.swiper-container-3d .swiper-slide-shadow-left,
.swiper-container-3d .swiper-slide-shadow-right,
.swiper-container-3d .swiper-slide-shadow-top,
.swiper-container-3d .swiper-slide-shadow-bottom {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 10;
}

.swiper-container-3d .swiper-slide-shadow-left {
  background-image: linear-gradient(to left, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

.swiper-container-3d .swiper-slide-shadow-right {
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

.swiper-container-3d .swiper-slide-shadow-top {
  background-image: linear-gradient(to top, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

.swiper-container-3d .swiper-slide-shadow-bottom {
  background-image: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0));
}

/* CSS Mode */
.swiper-container-css-mode>.swiper-wrapper {
  overflow: auto;
  scrollbar-width: none;
  /* For Firefox */
  -ms-overflow-style: none;
  /* For Internet Explorer and Edge */
}

.swiper-container-css-mode>.swiper-wrapper::-webkit-scrollbar {
  display: none;
}

.swiper-container-css-mode>.swiper-wrapper>.swiper-slide {
  scroll-snap-align: start start;
}

.swiper-container-horizontal.swiper-container-css-mode>.swiper-wrapper {
  scroll-snap-type: x mandatory;
}

.swiper-container-vertical.swiper-container-css-mode>.swiper-wrapper {
  scroll-snap-type: y mandatory;
}

:root {
  --swiper-navigation-size: 44px;
  /*
  --swiper-navigation-color: var(--swiper-theme-color);
  */
}

.swiper-button-prev,
.swiper-button-next {
  position: absolute;
  top: 50%;
  width: calc(var(--swiper-navigation-size) / 44 * 27);
  height: var(--swiper-navigation-size);
  margin-top: calc(-1 * var(--swiper-navigation-size) / 2);
  z-index: 10;
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--swiper-navigation-color, var(--swiper-theme-color));
}

.swiper-button-prev.swiper-button-disabled,
.swiper-button-next.swiper-button-disabled {
  opacity: 0.35;
  cursor: auto;
  pointer-events: none;
}

.swiper-button-prev:after,
.swiper-button-next:after {
  font-family: swiper-icons;
  font-size: var(--swiper-navigation-size);
  text-transform: none !important;
  letter-spacing: 0;
  text-transform: none;
  font-variant: initial;
}

.swiper-button-prev,
.swiper-container-rtl .swiper-button-next {
  left: 10px;
  right: auto;
}

.swiper-button-prev:after,
.swiper-container-rtl .swiper-button-next:after {
  content: 'prev';
}

.swiper-button-next,
.swiper-container-rtl .swiper-button-prev {
  right: 10px;
  left: auto;
}

.swiper-button-next:after,
.swiper-container-rtl .swiper-button-prev:after {
  content: 'next';
}

.swiper-button-prev.swiper-button-white,
.swiper-button-next.swiper-button-white {
  --swiper-navigation-color: #ffffff;
}

.swiper-button-prev.swiper-button-black,
.swiper-button-next.swiper-button-black {
  --swiper-navigation-color: #000000;
}

.swiper-button-lock {
  display: none;
}

:root {
  /*
  --swiper-pagination-color: var(--swiper-theme-color);
  */
}

.swiper-pagination {
  position: absolute;
  text-align: center;
  transition: 300ms opacity;
  transform: translate3d(0, 0, 0);
  z-index: 10;
}

.swiper-pagination.swiper-pagination-hidden {
  opacity: 0;
}

/* Common Styles */
.swiper-pagination-fraction,
.swiper-pagination-custom,
.swiper-container-horizontal>.swiper-pagination-bullets {
  bottom: 10px;
  left: 0;
  width: 100%;
}

/* Bullets */
.swiper-pagination-bullets-dynamic {
  overflow: hidden;
  font-size: 0;
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet {
  transform: scale(0.33);
  position: relative;
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active {
  transform: scale(1);
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active-main {
  transform: scale(1);
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active-prev {
  transform: scale(0.66);
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active-prev-prev {
  transform: scale(0.33);
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active-next {
  transform: scale(0.66);
}

.swiper-pagination-bullets-dynamic .swiper-pagination-bullet-active-next-next {
  transform: scale(0.33);
}

.swiper-pagination-bullet {
  width: 8px;
  height: 8px;
  display: inline-block;
  border-radius: 100%;
  background: #000;
  opacity: 0.2;
}

button.swiper-pagination-bullet {
  border: none;
  margin: 0;
  padding: 0;
  box-shadow: none;
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
}

.swiper-pagination-clickable .swiper-pagination-bullet {
  cursor: pointer;
}

.swiper-pagination-bullet-active {
  opacity: 1;
  background: var(--swiper-pagination-color, var(--swiper-theme-color));
}

.swiper-container-vertical>.swiper-pagination-bullets {
  right: 10px;
  top: 50%;
  transform: translate3d(0px, -50%, 0);
}

.swiper-container-vertical>.swiper-pagination-bullets .swiper-pagination-bullet {
  margin: 6px 0;
  display: block;
}

.swiper-container-vertical>.swiper-pagination-bullets.swiper-pagination-bullets-dynamic {
  top: 50%;
  transform: translateY(-50%);
  width: 8px;
}

.swiper-container-vertical>.swiper-pagination-bullets.swiper-pagination-bullets-dynamic .swiper-pagination-bullet {
  display: inline-block;
  transition: 200ms transform, 200ms top;
}

.swiper-container-horizontal>.swiper-pagination-bullets .swiper-pagination-bullet {
  margin: 0 4px;
}

.swiper-container-horizontal>.swiper-pagination-bullets.swiper-pagination-bullets-dynamic {
  left: 50%;
  transform: translateX(-50%);
  white-space: nowrap;
}

.swiper-container-horizontal>.swiper-pagination-bullets.swiper-pagination-bullets-dynamic .swiper-pagination-bullet {
  transition: 200ms transform, 200ms left;
}

.swiper-container-horizontal.swiper-container-rtl>.swiper-pagination-bullets-dynamic .swiper-pagination-bullet {
  transition: 200ms transform, 200ms right;
}

/* Progress */
.swiper-pagination-progressbar {
  background: rgba(0, 0, 0, 0.25);
  position: absolute;
}

.swiper-pagination-progressbar .swiper-pagination-progressbar-fill {
  background: var(--swiper-pagination-color, var(--swiper-theme-color));
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  transform: scale(0);
  transform-origin: left top;
}

.swiper-container-rtl .swiper-pagination-progressbar .swiper-pagination-progressbar-fill {
  transform-origin: right top;
}

.swiper-container-horizontal>.swiper-pagination-progressbar,
.swiper-container-vertical>.swiper-pagination-progressbar.swiper-pagination-progressbar-opposite {
  width: 100%;
  height: 4px;
  left: 0;
  top: 0;
}

.swiper-container-vertical>.swiper-pagination-progressbar,
.swiper-container-horizontal>.swiper-pagination-progressbar.swiper-pagination-progressbar-opposite {
  width: 4px;
  height: 100%;
  left: 0;
  top: 0;
}

.swiper-pagination-white {
  --swiper-pagination-color: #ffffff;
}

.swiper-pagination-black {
  --swiper-pagination-color: #000000;
}

.swiper-pagination-lock {
  display: none;
}

/* Scrollbar */
.swiper-scrollbar {
  border-radius: 10px;
  position: relative;
  -ms-touch-action: none;
  background: rgba(0, 0, 0, 0.1);
}

.swiper-container-horizontal>.swiper-scrollbar {
  opacity: 1;
  position: absolute;
  left: 1%;
  bottom: 10px;
  z-index: 50;
  height: 5px;
  width: 98%;
}

.swiper-container-vertical>.swiper-scrollbar {
  position: absolute;
  right: 3px;
  top: 1%;
  z-index: 50;
  width: 5px;
  height: 98%;
}

.swiper-scrollbar-drag {
  height: 100%;
  width: 100%;
  position: relative;
  background: #008dd4;
  border-radius: 10px;
  left: 0;
  top: 0;
}

.swiper-scrollbar-cursor-drag {
  cursor: move;
}

.swiper-scrollbar-lock {
  display: none;
}

.swiper-zoom-container {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}

.swiper-zoom-container>img,
.swiper-zoom-container>svg,
.swiper-zoom-container>canvas {
  max-width: 100%;
  max-height: 100%;
  object-fit: contain;
}

.swiper-slide-zoomed {
  cursor: move;
}

/* Preloader */
:root {
  /*
  --swiper-preloader-color: var(--swiper-theme-color);
  */
}

.swiper-lazy-preloader {
  width: 42px;
  height: 42px;
  position: absolute;
  left: 50%;
  top: 50%;
  margin-left: -21px;
  margin-top: -21px;
  z-index: 10;
  transform-origin: 50%;
  animation: swiper-preloader-spin 1s infinite linear;
  box-sizing: border-box;
  border: 4px solid var(--swiper-preloader-color, var(--swiper-theme-color));
  border-radius: 50%;
  border-top-color: transparent;
}

.swiper-lazy-preloader-white {
  --swiper-preloader-color: #fff;
}

.swiper-lazy-preloader-black {
  --swiper-preloader-color: #000;
}

@keyframes swiper-preloader-spin {
  100% {
    transform: rotate(360deg);
  }
}

/* a11y */
.swiper-container .swiper-notification {
  position: absolute;
  left: 0;
  top: 0;
  pointer-events: none;
  opacity: 0;
  z-index: -1000;
}

.swiper-container-fade.swiper-container-free-mode .swiper-slide {
  transition-timing-function: ease-out;
}

.swiper-container-fade .swiper-slide {
  pointer-events: none;
  transition-property: opacity;
}

.swiper-container-fade .swiper-slide .swiper-slide {
  pointer-events: none;
}

.swiper-container-fade .swiper-slide-active,
.swiper-container-fade .swiper-slide-active .swiper-slide-active {
  pointer-events: auto;
}

.swiper-container-cube {
  overflow: visible;
}

.swiper-container-cube .swiper-slide {
  pointer-events: none;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  z-index: 1;
  visibility: hidden;
  transform-origin: 0 0;
  width: 100%;
  height: 100%;
}

.swiper-container-cube .swiper-slide .swiper-slide {
  pointer-events: none;
}

.swiper-container-cube.swiper-container-rtl .swiper-slide {
  transform-origin: 100% 0;
}

.swiper-container-cube .swiper-slide-active,
.swiper-container-cube .swiper-slide-active .swiper-slide-active {
  pointer-events: auto;
}

.swiper-container-cube .swiper-slide-active,
.swiper-container-cube .swiper-slide-next,
.swiper-container-cube .swiper-slide-prev,
.swiper-container-cube .swiper-slide-next+.swiper-slide {
  pointer-events: auto;
  visibility: visible;
}

.swiper-container-cube .swiper-slide-shadow-top,
.swiper-container-cube .swiper-slide-shadow-bottom,
.swiper-container-cube .swiper-slide-shadow-left,
.swiper-container-cube .swiper-slide-shadow-right {
  z-index: 0;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}

.swiper-container-cube .swiper-cube-shadow {
  position: absolute;
  left: 0;
  bottom: 0px;
  width: 100%;
  height: 100%;
  background: #000;
  opacity: 0.6;
  -webkit-filter: blur(50px);
  filter: blur(50px);
  z-index: 0;
}

.swiper-container-flip {
  overflow: visible;
}

.swiper-container-flip .swiper-slide {
  pointer-events: none;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  z-index: 1;
}

.swiper-container-flip .swiper-slide .swiper-slide {
  pointer-events: none;
}

.swiper-container-flip .swiper-slide-active,
.swiper-container-flip .swiper-slide-active .swiper-slide-active {
  pointer-events: auto;
}

.swiper-container-flip .swiper-slide-shadow-top,
.swiper-container-flip .swiper-slide-shadow-bottom,
.swiper-container-flip .swiper-slide-shadow-left,
.swiper-container-flip .swiper-slide-shadow-right {
  z-index: 0;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}
</style>
