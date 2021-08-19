// axios.get("/get_page", {
//     params: {
//         page_name: 'about'
//     }
// }).then(function (response) {
//     // response 인자를 받아 처리
// }).catch(function (ex) {
//     // ex 인자를 받아 에러 처리
// })

const axios = require('axios')
axios({
  method : 'get',
  url : 'https://www.naver.com/'
}).then((res)=>{
  console.log(res)
})
