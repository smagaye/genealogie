$(function(){

	$("#wizard").steps({
        headerTag: "h2",
        bodyTag: "section",
        transitionEffect: "fade",
        enableAllSteps: true,
        transitionEffectSpeed: 500,
        labels: {
            finish: "Validé",
            next: "Suivant",
            previous: "Précédent"
        }
    });

    $('.wizard > .steps li a').click(function(){
    	$(this).parent().addClass('checked');
		$(this).parent().prevAll().addClass('checked');
		$(this).parent().nextAll().removeClass('checked');

        var e="1. 2. 3. 4. current step: 5. ";
        var x = $('.wizard > .steps').text();
        if(e==x){

            swal("Veuillez consultez votre messagerie pour les informations de connexion!")
                .then((value)=>{
                $("#wizard").submit();
            });
        }
    });
    // Custome Jquery Step Button
    $('.forward').click(function(){
    	$("#wizard .labels").steps('next');
    })
    

    $('.backward').click(function(){
        $("#wizard").steps('previous');
    })
    // Select Dropdown
    $('html').click(function() {
        $('.select .dropdown').hide(); 
    });
    $('.select').click(function(event){
        event.stopPropagation();
    });
    $('.select .select-control').click(function(){
        $(this).parent().next().toggle();
    })    
    $('.select .dropdown li').click(function(){
        $(this).parent().toggle();
        var text = $(this).attr('rel');
        $(this).parent().prev().find('div').text(text);
    })
})
