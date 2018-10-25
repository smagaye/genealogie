(function($){
  $(function(){

    $('.sidenav').sidenav();
    $('.parallax').parallax();

  }); // end of document ready

    $('.counting').each(function() {
        var $this = $(this),
            countTo = $this.attr('data-count');

        $({ countNum: $this.text()}).animate({
                countNum: countTo
            },

            {

                duration: 90000,
                easing:'linear',
                step: function() {
                    $this.text(Math.floor(this.countNum));
                },
                complete: function() {
                    $this.text(this.countNum);
                    //alert('finished');
                }
            });
    });

    // Carousselle

    $('.carousel').carousel(
        {
            dist:0,
            padding: 0,
            fullWidth: true,
            indicators: false,
            duration: 100,
        }
    );

    function autoplay() {
        $('.carousel').carousel('next');
        setTimeout(autoplay, 4500);
    }
    autoplay();



})(jQuery); // end of jQuery name space

/* Statistiques */