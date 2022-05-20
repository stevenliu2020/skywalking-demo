import request from '@/utils/request'

export const userInfo = data => {
  return request({
    url: '/user',
    method: 'GET',
    data
  })
}
