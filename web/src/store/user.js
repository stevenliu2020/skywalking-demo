import { userInfo } from '@/api/user'

export default {
  namespaced: true,
  state: () => ({}),
  mutations: {},
  action: {
    userInfo () {
      return new Promise((resolve, reject) => {
        userInfo({
        })
          .then(data => {
            console.log(data)
            resolve()
          })
          .catch(err => {
            reject(err)
          })
      })
    }
  }
}
