<!DOCTYPE html>

<html>
    <head>
        <title>Operaciones</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    </head>
    <body>

        <div class="container">
            <form action="Operaciones" method="POST">

                <h1>Sumar</h1>
                <div class="bloque"><label>Cual es su nombre :</label>
                    <input type="text" name="nombre"></div>

                <div class="bloque"><label>Numero 1:</label>
                    <input type="text" name="n1"></div>

                <div class="bloque"><label>Numero 2:</label>
                    <input type="text" name="n2"></div>

                <div>
                    <select name="opcion">
                        <option value="Suma" selected>Suma</option> 
                        <option value="Resta">Resta</option>
                        <option value="Multiplicacion">Multiplicacion</option>
                        <option value="Division">Division</option> 
                        <option value="Seno">Seno del angulo</option> 
                        <option value="Coseno">Coseno del angulo</option> 
                    </select>
                </div>



                <div class="bloque"><input type ="submit" value="="> </div>
            </form>
        </div>



        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>



    </body>
</html>
