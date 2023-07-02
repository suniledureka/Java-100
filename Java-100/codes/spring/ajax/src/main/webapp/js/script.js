let xhr;

function getEmployeeDetails(empno){
	xhr = new XMLHttpRequest();
	
	xhr.open("GET", "search?eno="+empno, true); //true - asynchronous
	
	xhr.onreadystatechange = stateChanged;
	
	xhr.send();	
}


let name_field = document.getElementById("emp_name");
let sal_field = document.getElementById("emp_sal");

function stateChanged(){
	let ename = 'NO MATCH';
	let esal = 'NO MATCH';
	
	if(xhr.readyState==4 && xhr.status==200){
		let respText = xhr.responseText;
		
		if(respText.length > 0){
			let object = JSON.parse(respText);
			
			ename = object.emp_name;
			esal = object.emp_sal;
		}
		
		name_field.innerText = ename;
		sal_field.innerText = esal;
	}
}