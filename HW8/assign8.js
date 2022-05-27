
var libButton = document.getElementById("tellStory");
var libIt = function() {
	var p_name=document.getElementById("name").value;
	var c=document.getElementById("character").value;
	var adv=document.getElementById("adverb").value;
	var adj=document.getElementById("adjective").value;

	var storyDiv = document.getElementById("madlibs");
	storyDiv.innerHTML = p_name+ " always feels "+ adj+ " in his math class. "+
	"However, now he doesn't feel having math class is " +adj+" anymore becase "+
	"he has a new teacher. This history teacher is "+ c+ 
	". Therefore, "+p_name+" have more interest to take "
	+"history class because of this "+adv+" "+c+
	" teacher."
	storyDiv.style.display="block";
	event.preventDefault();

};
libButton.addEventListener('click', libIt);

