import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import store from './store';
import 'element-ui/lib/theme-chalk/index.css';
import "swiper/css/swiper.css"
Vue.use(ElementUI);
Vue.config.productionTip = false

new Vue({
  store: store,
  router,
  render: function (h) { return h(App) }
}).$mount('#app')
