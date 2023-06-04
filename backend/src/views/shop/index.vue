<template>
  <div>


    <div class="ward">
      <div class="fp_box_2">
        <div class="banner">
          <img src="../../assets/image/banner_two.png" width="100%">
        </div>
        <div class="pic_du clearfix">
          <div class="left">
            <a href="#"><img src="../../assets/image/cv1.png" width="100%"></a>
            <a href="#"><img src="../../assets/image/cv2.png" width="100%"></a>
          </div>
          <div class="rii">
            <a href="#"><img src="../../assets/image/cv3.png" width="100%"></a>
            <a href="#"><img src="../../assets/image/cv4.png" width="100%"></a>
            <a href="#"><img src="../../assets/image/cv5.png" width="100%"></a>
          </div>
        </div>
        <div class="list_img">
          <ul class="clearfix">

            <li>
              <div>
                <img src="../../assets/image/io1.jpg">
                <p>PREORDER - Justice Is Coming: How Progressives Are Going to Take Over the Country and
                  America Is Going to Love It
                </p>
                <a href="#">$29.54 USD</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/io2.jpg">
                <p>PRE-ORDER: Justice is Coming Zip-Up Hoodie <br>
                  PRE-ORDER: Justice is Coming Zip-Up Hoodie</p>
                <a href="#">$65.00 USD</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/io3.png">
                <p>Funky Feminist AF Cotton Candy Crop Hoodie <br>
                  Funky Feminist AF Cotton Candy Crop Hoodie</p>
                <a href="#">$70.00 USD</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/io4.jpg">
                <p>PRE-ORDER PROTOTYPE: Justice is Coming T-Shirt <br>
                  PRE-ORDER PROTOTYPE: Justice is Coming T-Shirt</p>
                <a href="#">$40.00 USD</a>
              </div>
            </li>
            <li class="hover">
              <div>

              </div>
            </li>

          </ul>
        </div>

        <div class="list_img list_img2">
          <h3 style="text-align: center;padding: 30px 0; color: #fff;font-size: 35px;">Best Selling Collections</h3>
          <br>
          <ul class="clearfix">

            <li>
              <div>
                <img src="../../assets/image/uit1.jpg">

                <a href="#">Best Sellers</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/uit2.jpg">

                <a href="#">Feminist AF</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/uit3.jpg">

                <a href="#">The Young Turks</a>
              </div>
            </li>
            <li>
              <div>
                <img src="../../assets/image/uit4.jpg">

                <a href="#">The Damage Report</a>
              </div>
            </li>


          </ul>
        </div>
      </div>
    </div>

  </div>
</template>
<script>

import AliFooter from '../../components/footer.vue'
import AliHeader from '../../components/header.vue'
export default {
  components: {
    AliFooter,
    AliHeader
  }
}

</script>

<style scoped lang="css">
/*通用类*/
* {
  margin: 0;
  padding: 0;
}

body {
  min-width: 1400px;
  margin: 0 auto;
  font-size: 14px;
  background: #fff;
  text-align: justify;
  color: #000;
}

h1,
h2,
h3 {
  font-weight: 500;
}

img {
  border: none;
}

a {
  cursor: pointer;
  color: #000;
  text-decoration: none;
  outline: none;
}

a:hover {
  color: #f60;
}

ul {
  list-style-type: none;
}

em {
  font-style: normal;
}

.lt {
  float: left;
}

.rt {
  float: right;
}

input.sub,
label {
  border: none;
  cursor: pointer;
}

select {
  appearance: none;
  -moz-appearance: none;
  -webkit-appearance: none;
}

input,
textarea {
  outline: none;
}

table {
  border-collapse: collapse;
}

table td,
table th {
  padding: 0;
}

input::-webkit-input-placeholder,
textarea::-webkit-input-placeholder {
  color: #515151;
}

input::-moz-placeholder,
textarea::-moz-placeholder {
  /* Mozilla Firefox 19+ */
  color: #515151;
}

input:-moz-placeholder,
textarea:-moz-placeholder {
  /* Mozilla Firefox 4 to 18 */
  color: #515151;
}

input:-ms-input-placeholder,
textarea:-ms-input-placeholder {
  /* Internet Explorer 10-11 */
  color: #515151;
}

div.clear {
  font: 0px Arial;
  line-height: 0;
  height: 0;
  overflow: hidden;
  clear: both;
}

.clearfix:after {
  content: "";
  display: block;
  clear: both;
  visibility: hidden;
  line-height: 0;
  height: 0;
}

.line5 {
  font-size: 1px;
  height: 5px;
  width: 100%;
  clear: both;
}

.line10 {
  font-size: 1px;
  height: 10px;
  width: 100%;
  clear: both;
}

.line20 {
  font-size: 1px;
  height: 20px;
  width: 100%;
  clear: both;
}

.line50 {
  font-size: 1px;
  height: 50px;
  width: 100%;
  clear: both;
}

.line150 {
  font-size: 1px;
  height: 150px;
  width: 100%;
  clear: both;
}

.show {
  display: block !important;
}


/*公用CSS 开始*/
.fp_box_1 {
  background: url(../../assets/image/bg2.png) no-repeat top;
  height: 530px;
  padding: 0 10px;
  box-sizing: border-box;
}

.top {
  padding-top: 80px;
  text-align: center;
  position: relative;
  z-index: 2;
}

.top span {
  font-size: 40px;
  color: #fff;
  letter-spacing: 20px;
}

.top img {
  display: inline-block;
}

.top em {
  font-size: 16px;
  color: #fff;
}

.top_2 {
  margin-top: 30px;
  color: #fff;
  font-size: 20px;
}

.fp_box_1 .left {
  width: 68%;
  float: left;
  margin-top: 20px;
}

.fp_box_1 .left .he {
  height: 190px;
}

.fp_box_1 .left .he .pic {
  width: 28%;
  height: 100%;
  float: left;
}

.fp_box_1 .left .he .pic img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.fp_box_1 .left .he .text {
  width: 72%;
  float: left;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.1);
  padding: 20px 30px;
  box-sizing: border-box;
}

.fp_box_1 .left .he .text h3 {
  color: #999;
  margin-bottom: 20px;
}

.fp_box_1 .left .he .text p {
  color: #999;
  margin-bottom: 20px;
}

.fp_box_1 .left .he .text span {
  color: #999;
}

.fp_box_1 .left .ft {
  margin: 30px 0;
}

.fp_box_1 .left .ft ul li {
  float: left;
  width: 33.33%;
}

.fp_box_1 .left .ft ul li img {
  float: left;
  width: 20%;
  height: 50px;
}

.fp_box_1 .left .ft ul li p {
  display: inline-block;
  float: left;
  text-align: left;
  width: 70%;
  padding-left: 30px;
  color: #fff;
}

.fp_box_1 .rii {
  width: 30%;
  float: right;
  height: 290px;
  border: 5px solid #EFB42C;
  padding: 10px;
  box-sizing: border-box;
  text-align: center;
}

.fp_box_1 .rii h3 {
  font-size: 22px;
  color: #E7B32D;
}

.fp_box_1 .rii ul li {
  text-align: center;
  width: 33.33%;
  float: left;
  color: #ccc;
  font-size: 12px;
}

.fp_box_1 .rii ul li img {
  display: block;
  margin: 20px auto;
}

.fp_box_1 .rii a {
  display: block;
  width: calc(min(374px, 100%));
  height: 40px;
  background: url(../../assets/image/but.png) no-repeat center;
  background-size: 100% 100%;
  margin: 0 auto;
  text-align: center;
  font-size: 14px;
  font-weight: bold;
  position: relative;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-top: 45px;
}

.title {
  padding: 20px;
  color: #999;
}

.fp_box_2 .left {
  width: 32%;
  float: right;
}

.box_dy {
  background-color: #21232B;
  border-radius: 2px;
  margin-bottom: 30px;
}

.box_dy1 {
  padding: 30px 30px 0 30px;
  box-sizing: border-box;
  border-bottom: 1px solid #ccc;
}

.box_dy1 .top {
  height: 230px;
  padding: 0;
}

.box_dy1 .top .pic {
  width: 50%;
  float: left;
  height: 100%;
}

.box_dy1 .top .pic img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.box_dy1 .top .text {
  width: 50%;
  float: right;
  text-align: center;
  padding: 20px;
  box-sizing: border-box;
  color: #fff;
}

.box_dy1 .top .text h3 {
  font-size: 16px;
}

.box_dy1 .top .text h4 {
  margin: 20px 0;
}

.box_dy1 .top .text p {
  font-size: 12px;
}

.box_dy1 .box .zuo {
  width: 50%;
  float: left;
  height: 70px;
  text-align: center;
  padding: 10px 0;
  position: relative;
}

.box_dy1 .box .zuo h5 {
  color: #fff;
}

.box_dy1 .box .zuo span {
  display: block;
  color: #999;
}

.box_dy1 .box .zuo img {
  position: absolute;
  top: 15px;
  left: 20%;
}

.box_dy_3 .list {
  padding: 20px;
  box-sizing: border-box;
  border-bottom: 1px solid #ccc;
}

.box_dy_3 .hjlk {
  background-color: #20222A;
}

.box_dy_3 .hjlk h3 {
  color: #fff;
  font-size: 16px;
  margin-bottom: 20px;
}

.box_dy_3 .hjlk h3 i {
  display: inline-block;
  padding: 5px;
  background-color: #89ED5B;
  font-style: normal;
  font-size: 20px;
  margin-right: 10px;
}

.box_dy_3 .hjlk p {
  font-size: 14px;
  color: #fff;
  margin-bottom: 20px;
  text-align: left;
  line-height: 28px;
}

.box_dy_3 .hjlk a {
  color: #7a96ff;
  display: block;
  margin-bottom: 30px;
}

.box_dy_3 .hjlk em {
  margin-right: 20px;
  font-size: 16px;
  color: #fff;
  margin-bottom: 20px;
  display: inline-block;
}

.box_dy_3 .hjlk {
  padding: 20px 0;

}

.box_dy_3 .hjlk em.em1 {
  color: #89ed5b;
}

.box_dy_3 .hjlk strong {
  font-weight: normal;
  display: inline-block;
  border: 1px solid #2B2B2B;
  color: #a4a4a4;
  font-size: 12px;
  letter-spacing: .4px;
  padding: 3px 5px;
}

.zhong {
  width: 30%;
  float: left;
  margin-left: 0%;
}

.topi {
  background-color: #21232B;
  padding: 10px 20px;
  box-sizing: border-box;
}

.topi ul li {
  padding: 40px 0;
  border-bottom: 1px solid #ccc;
  position: relative;

}

.topi ul li>img {
  position: absolute;
  top: 70px;
  left: 10px;
}

.topi ul li h3 {
  font-size: 14px;
  color: #999;
}

.topi ul li p {
  font-size: 12px;
  color: #fff;
  padding-left: 80px;
  padding-top: 20px;
}

.topi ul li p i {
  font-style: normal;
  color: yellow;
}

.topi ul li .time {
  position: absolute;
  top: 20px;
  right: 20px;
  color: #fff;
  text-align: center;
}

.topi ul li .time img {
  text-align: center;
  margin: 5px auto;
}

.top_3 {
  height: 290px;
  background-color: #20222A;
  margin-top: 20px;
}

.top_3 ul li {
  width: 50%;
  float: left;
}

.top_3 ul li img {
  width: 100%;
}

.top_3 ul li p {
  padding: 15px;
  box-sizing: border-box;
  color: #fff;
}

.top_4 {
  height: 230px;
  background-color: #20222A;
  margin-top: 20px;
  padding: 20px 30px;
  box-sizing: border-box;
  padding-top: 60px;
}

.top_4 h3 {
  font-size: 26px;
  color: #999;
}

.top_4 a {
  display: block;
  margin: 30px auto;
  color: #fff;
  border: 2px solid white;
  padding: 0.5em;
  text-align: center;
}

.fp_box_2 .left.left2 {
  float: left;
  width: 30%;
  margin-left: 4.5%;
}



.bitt .rii {
  width: 100%;
  float: none;
  height: 290px;
  border: 5px solid #EFB42C;
  padding: 10px;
  box-sizing: border-box;
  text-align: center;
  margin: 50px 0;
  padding-top: 30px;
}

.bitt .rii h3 {
  font-size: 22px;
  color: #E7B32D;
}

.bitt .rii ul li {
  text-align: center;
  width: 33.33%;
  float: left;
  color: #ccc;
  font-size: 12px;
}

.bitt .rii ul li img {
  display: block;
  margin: 20px auto;
}

.bitt .rii a {
  display: block;
  width: calc(min(374px, 100%));
  height: 40px;
  background: url(../../assets/image/but.png) no-repeat center;
  background-size: 100% 100%;
  margin: 0 auto;
  text-align: center;
  font-size: 14px;
  font-weight: bold;
  position: relative;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  margin-top: 45px;
}

/* shop */
.banner {
  margin: 50px 0;
  margin-top: 130px;
}

.pic_du .left {
  width: 65%;
  float: right;
}

.pic_du .left img {
  margin-bottom: 85px;
}

.pic_du .rii {
  float: left;
  width: 32%;
}

.pic_du .rii img {
  margin-bottom: 50px;
}

.list_img ul {
  margin-left: -10px;
  margin-right: -10px;
  margin-bottom: 60px;
}

.list_img ul li {
  width: 20%;
  float: left;
  height: 525px;
  padding: 0 10px;
  box-sizing: border-box;
}

.list_img ul li>div {
  border: 1px solid #ccc;
  padding: 20px;
  box-sizing: border-box;
  height: 100%;
  background-color: #fff;
}

.list_img ul li p {
  font-size: 16px;
  text-align: left;
  margin: 10px 0;
}

.list_img ul li img {
  max-height: 350px;
  display: block;
  margin: 0 auto;
}

.list_img ul li a {
  color: #0077AA;
}

.list_img ul li.hover div {
  background: url(../../assets/image/io5.png) no-repeat center;
  background-size: 100% 100%;
}

.list_img2 ul li {
  width: 25%;
}

.list_img2 ul li>div {
  background: none;
  border: none;
}

.list_img2 ul li a {
  display: block;
  text-align: center;
  margin: 50px 0;
  font-size: 22px;
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
*/</style>
