import Vue from 'vue';
import VueRouter from 'vue-router';
import MainView from '../views/main/index.vue';
import home from "../views/home/index.vue";
import news from "../views/news/index.vue";
import search from "../views/search/index.vue";
import comment from "../views/comment/index.vue";
import podcast from "../views/podcast/index.vue";
import us from "../views/us/index.vue";
import community from "../views/community/index.vue";
import shop from "../views/shop/index.vue";
import join from "../views/join/index.vue";
import sigin from "../views/sigin/index.vue";


import Cookies from "js-cookie";
Vue.use(VueRouter);

const routes = [
  {
    path: '/main',
    component: MainView,
    children: [
      {
        path: '/main/home',
        component: home,
        meta: {
          name: "home",
          title: "home"
        }
      },
      {
        path: '/main/news',
        component: news, meta: {
          name: "news",
          title: "news"
        }
      },
      {
        path: '/main/search',
        component: search, meta: {
          name: "search",
          title: "search"
        }
      },
      {
        path: '/main/podcast',
        component: podcast, meta: {
          name: "podcast",
          title: "podcast"
        }
      }
      , {
        path: '/main/us',
        component: us,
        meta: {
          name: "us",
          title: "us"
        }
      },
      {
        path: '/main/community',
        component: community, meta: {
          name: "community",
          title: "community"
        }
      },
      {
        path: '/main/shop',
        component: shop, meta: {
          name: "shop",
          title: "shop"
        }
      },
      {
        path: '/main/join',
        component: join, meta: {
          name: "join",
          title: "join"
        }
      }
      , {
        path: '/main/sigin',
        component: sigin, meta: {
          name: "sigin",
          title: "sigin"
        }
      }
      , {
        path: '/main/comment',
        component: comment,
        meta: {
          name: "comment",
          title: "comment"
        }
      }
    ]
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

// let whiteList = ["/teaRegister", "/studentRegister", "/teacherFindPwd", "/studentFindPwd"]

// router.beforeEach((to, from, next) => {
//   if (whiteList.includes(to.path)) {
//     return next()
//   }
//   let isLogin = Cookies.get("token")

//   if (isLogin) {
//     if (to.path.includes("login")) {
//       next("/index")
//     } else {
//       next()
//     }
//   } else if (!to.path.includes("login")) {
//     next("/login")
//   } else {
//     next()
//   }
// })

export default router;
