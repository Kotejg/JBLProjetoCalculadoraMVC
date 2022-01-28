<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Servelet</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

 <div class="container ">
    <div class="row align-items-left mt-3 ">
      <div class="col-12 col-md-5 mx-auto border">
        <h3 class="text-primary">calculadora</h3>
        <form name="frmCalculadora" method="post" action="CalculadoraServlet">
          <div class="row">
            <div class="col-3 align-items-center">
              <h6>numero 1:</h6>
            </div>
            <div class="col-9">
              <input type="number" name="valor1" class="form-control">
            </div>
          </div>
          <!-- ******************************* -->
          <div class="row">
            <div class="col-3 align-items-center">
              <h6>numero 2:</h6>
            </div>
            <div class="col-9">
              <input type="number" name="valor2"  class="form-control">
            </div>
          </div>
          <h6 class="title-primary text-center">Resultado = ${requestScope.resultado}</h6>
          <div class="align-items-center mt-2 mb-3">
            <button  type="reset" class="btn btn-warning  btn-lg">limpar</button>
            <button type="submit" name="btnSomar"      value="+" class="btn btn-success btn-lg">+</button>
            <button type="submit" name="btnSub"      value="-" class="btn btn-success btn-lg">-</button>
            <button type="submit" name="btnMulti"   value="*" class="btn btn-success btn-lg">*</button>
            <button type="submit" name="btnDiv"  value="/" class="btn btn-success btn-lg">/</button> 
          </div>

        </form>
      </div>




    </div>
  </div>


</body>
</html>