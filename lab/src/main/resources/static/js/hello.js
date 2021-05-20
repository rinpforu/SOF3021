console.log("Hello");
const url= "http://localhost:9393/demo-api";
fetch(url)
.then(response => response.text())
.then((response)=>{
    console.log(response)
})
    .catch(err => console.log(err))