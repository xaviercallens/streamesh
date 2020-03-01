import Vue from 'vue'
import VueRouter from 'vue-router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import App from './App.vue'
import './plugins/element.js'
import ServiceTable from './components/ServicesTable.vue'
import ServiceDetails from './components/ServiceDetails.vue'

Vue.config.productionTip = false
Vue.use(VueRouter)
Vue.use(ElementUI)

const routes = [
  { path: '/services', component: ServiceTable },
  { path: '/services/:id', component: ServiceDetails, props: true }
]

const router = new VueRouter({
  routes
})


new Vue({
  router,
  render: h => h(App),
  el: '#app',
  data: function () {
    return { visible: false }
  }
}).$mount('#app')