import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)


const store = new Vuex.Store({
  state: {
    userInfo: {
      userAccount: "",
      userName: "",
      status: "",
      id: ""
    },
    teacherInfo: {}
  },
  mutations: {
    setUserInfo (state, payload) {
      state.userInfo = payload
    },
    setTeacherInfo (state, payload) {
      state.teacherInfo = payload
    }
  }
})

export default store