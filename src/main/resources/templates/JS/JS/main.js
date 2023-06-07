const form = document.querySelector('form');
const cName = document.querySelector('#cName');
const cType =document.querySelector('#cType');
const cDescription = document.querySelector('#cDescription');
const sButton = document.querySelector('button');

sButton.addEventListener('click', async(e) => {
e.preventDefault();

//creating my object literal and assigning the key value pairs as the id values from the from
    const computer = {
        cName:document.querySelector('#cName').value,
        cType:document.querySelector('#cType').value,
        cDescription:document.querySelector('#cDescription').value,
};

// using try catch  for fetch and post and errors
    try {

        const response = await fetch('http://localhost:8080/api/computers', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(computer)   //body is the object literal with the values that we passed in.
    });
if(response.ok){
    console.log('Computer created successfully');
    window.location.reload();
}
else{
    console.log('Computer creation failed');
}
}catch (err) {
    console.log('An error occured  ');
}

    }







// // first select the form element
//  const carForm = document.querySelector('form');
//
//
//
// // then select the input element
//  const cName = document.querySelector('#cName');
//  const cType = document.querySelector('#cType');
//  const cDescription = document.querySelector('#cDescription');
//
//
//
//  // then select the button element
//  const submitButton = document.querySelector('button');
//
//  // once every aspect of the form is in the DOM via Id or query selector add an even listener to the button
// //prevent default action
// //then get the values of the inputs that you extracted from the html
//
//
//
//
//
//  // then add an event listener to the button
//  submitButton.addEventListener('click', (e) => {
//   e.preventDefault();
//   // then get the value of the input element
//   const cName = cName.value;
//   const cType = cType.value;
//   const cDescription = cDescription.value;
//
//   const computer ={
    name: cName,
    type: cType,
    description: cDescription
  }

  //using async await function, post the computer object to the server at localhost:8080/api/computers



//
//   // then create a new element with the value of the input element
//  function createCar() {
//   // then create a new element with the value of the input element
//   const newCar = document.createElement('li');
//   newCar.innerHTML = `<h3>${cName}</h3>
//   <p>${cType}</p>
//   <p>${cDescription}</p>`;
//  }
//  // then append the new element to the body of the page
//  document.body.appendChild(createCar());
//  // then remove the new element from the form
//  carForm.removeChild(createCar());
//  // then remove the event listener from the button
//  submitButton.removeEventListener('click', createCar);
// });
//
// function createCar() {
//   const newCar = document.createElement('li');
//   newCar.innerHTML = `<h3>${cName}</h3>
//   <p>${cType}</p>
//   <p>${cDescription}</p>`;
//   return newCar;
// }

createCar();


