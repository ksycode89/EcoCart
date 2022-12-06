
const Toast = Swal.mixin({
    toast: true,
    showConfirmButton: false,
    timer: 1500,
    timerProgressBar: false,
   
})
function toast (a,b){
 Toast.fire({
 
    icon: a,
    title: b
					})  
}
					
function swal (a,b,c){
	Swal.fire({
      title: a,
      text: b,
      icon: c,
    })
}

function sweetConfirm(msg, callBack,c){
	let msgA = {'C' : '등록' , 'R' : '조회' , 'U' : '마감', 'D' : '삭제' }
	 
Swal.fire({
   title: c,
   icon: 'warning',
   
   showCancelButton: true, // cancel버튼 보이기. 기본은 원래 없음
   confirmButtonColor: '#3085d6', // confrim 버튼 색깔 지정
   cancelButtonColor: '#d33', // cancel 버튼 색깔 지정
   confirmButtonText: '승인', // confirm 버튼 텍스트 지정
   cancelButtonText: '취소', // cancel 버튼 텍스트 지정
   
   reverseButtons: false, // 버튼 순서 거꾸로
   
}).then(result => {
   // 만약 Promise리턴을 받으면,
   if (result.isConfirmed) { // 만약 모달창에서 confirm 버튼을 눌렀다면
   
      Swal.fire('주문마감 완료', '화끈하시네요~!', 'success');
   }
});
	 	
} 

	function cSwal(a,callB,c){
		
		Swal.fire({
		   title: a+'하시겠습니까?',
		   icon: 'warning',
		   
		   showCancelButton: true, 
		   confirmButtonColor: '#3085d6', 
		   cancelButtonColor: '#d33', 
		   confirmButtonText: '확인', 
		   cancelButtonText: '취소', 
		   
		}).then(result => {
		   if (result.isConfirmed) { 
		   callB()
		    
		   }
		});
	}
