function loadTweets(){


fetch("http://localhost:8081/api/tweets")

.then(res=>res.json())

.then(data=>{


let feed=document.getElementById("feed");


feed.innerHTML="";


data.reverse().forEach(t=>{


feed.innerHTML+=`

<div class="card">


<div class="user">

<div class="avatar">
👤
</div>


<div>

<h3>
Student
<span>@campus</span>
</h3>


<p>
${t.content}
</p>


</div>

</div>



<div class="actions">


<button onclick="likeTweet(${t.id})">

❤️ ${t.likes}

</button>



<button onclick="editTweet(${t.id}, '${t.content}')">

✏️ Edit

</button>



<button onclick="deleteTweet(${t.id})">

🗑 Delete

</button>


</div>



</div>


`;

});


});

}



function postTweet(){


let text=
document.getElementById("tweet").value;


if(text.trim()==""){

alert("Write something!");

return;

}



fetch(
"http://localhost:8081/api/tweets",

{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:
JSON.stringify({

content:text

})

}

)

.then(()=>{


document.getElementById("tweet").value="";

loadTweets();


});


}





function editTweet(id,oldText){


let newText=
prompt(
"Update your tweet:",
oldText
);



if(newText){


fetch(
"http://localhost:8081/api/tweets/"+id,

{

method:"PUT",

headers:{
"Content-Type":"application/json"
},


body:
JSON.stringify({

content:newText

})

}

)

.then(()=>loadTweets());


}


}







function likeTweet(id){


fetch(

"http://localhost:8081/api/tweets/"
+id+
"/like",

{
method:"PUT"
}

)

.then(()=>loadTweets());


}






function deleteTweet(id){


if(confirm("Delete tweet?")){


fetch(

"http://localhost:8081/api/tweets/"+id,

{
method:"DELETE"
}

)

.then(()=>loadTweets());


}


}





function logout(){


localStorage.removeItem("user");


window.location="login.html";


}

let user={


username:
username.value,


email:
email.value,


password:
password.value,


course:
course.value,


year:
year.value,


skills:
skills.value,


bio:
bio.value


};

function searchUser(){


let key=
search.value;



fetch(
"http://localhost:8081/api/users/search/"
+key)


.then(r=>r.json())

.then(data=>{


result.innerHTML="";


data.forEach(u=>{


result.innerHTML+=`

<div class="card">

<h3>${u.username}</h3>

<p>
${u.course} - ${u.year}
</p>

<p>
Skills: ${u.skills}
</p>


<p>
${u.bio}
</p>


</div>

`;

});

});

}

loadTweets();