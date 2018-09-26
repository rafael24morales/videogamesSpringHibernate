$(document).ready(function(){

    $.getJSON( "/videogames", function( data ) {
        console.log(data);
        var videogameData = '';
        $.each( data, function( key, val ) {
            videogameData += '<tr>';
            videogameData += "<th scope='row'>"+ val.idVideogame +"</th>";
            videogameData += "<td>"+ val.video_name +"</td>";
            videogameData += "<td>"+ val.platform +"</td>";
            videogameData += "<td>"+ val.category +"</td>";
            videogameData += '</tr>';

        });
        $('#videogameTable').append(videogameData);


    });


});

