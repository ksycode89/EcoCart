


const Toast = Swal.mixin({
    toast: true,
    showConfirmButton: false,
    timer: 1500,
    timerProgressBar: false,
   
})

function swal (a,b,c){
	Swal.fire({
      title: a,
      text: b,
      icon: c,
    })
}