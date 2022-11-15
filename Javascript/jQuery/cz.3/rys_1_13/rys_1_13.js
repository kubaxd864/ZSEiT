$(function(){
  $('input').on('focus', function(){
    $('span').eq(0).css('display', 'inline').fadeout(4500);
  });

  $('input').on('blur', function(){
    $('span').eq(1).css('display', 'inline').fadeout(4500);
  });

  $('input').on('change', function(){
    $('span').eq(2).css('display', 'inline').fadeout(4500);
  });
}); 
  