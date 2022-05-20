import axios from 'axios'

const service = axios.create({
  baseURL: 'http://120.26.37.252:8090',
  timeout: 5000
})

export default service
