$(function(){
    $('button').on('click', function() {
      $('#send').css({
        'display': 'block',
      })
      $('#reset').css({
        'background-color': 'green',
      })
      $('#kupione').css({
        'background-color': 'green',
      })
      $('#send1').css({
        'background-color': 'green',
      })
    });
    $('#reset').on('click', function() {
      location.reload();
    });
    $('#kupione').change(function(){
      $('#send1').css({
        'background-color': 'green',
      })
      $('#reset').css({
        'background-color': 'green',
      })
      $('#kupione').css({
        'background-color': 'green',
      })
    }).keyup();
  }); 