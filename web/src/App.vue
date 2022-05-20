<template>
  <img src="./assets/logo.png">
  <div>
    <el-button type="primary" @click="btnClick">调用后端</el-button>
  </div>
</template>

<script setup>
import { } from 'vue'
import { userInfo } from '@/api/user'
import { ElMessage } from 'element-plus'
const btnClick = async () => {
  const result = await userInfo()
  console.log(result.data.data)
  ElMessage.success('调用成功')
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
