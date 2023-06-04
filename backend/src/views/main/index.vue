<template>
  <div style="background-color: #171921;">
    <ali-header />
    <router-view />
    <ali-footer />
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
<style></style>
