/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(main);
 
var contador = 1;
 
function main(){
	$('.menu_bar').click(function(){
		// $('nav').toggle(); 
		if(contador === 1){
			$('nav').slideDown();
			contador = 0;
		} else {
			contador = 1;
			$('nav').slideUp();
		}
 
	});
 
}