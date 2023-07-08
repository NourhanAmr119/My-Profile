<?php
$dbHost="localhost";
$dbUser="root";
$dbPassword="";
$dbName="Yummy";

try {
    $dsn="mysql:host=".$dbHost .";dbName".$dbName;
    $pdo=new PDO($dsn,$dbUser,$dbPassword);
    echo "تم";
} catch (PDOException $e) {
    echo "حدث خطأ" . $e->getline();
}
if(isset($_POST['Send']))
    //include  "index.php";
    $fname=(isset($_POST["fname"]));
    $lname=(isset($_POST["lname"]));
    $phone=(isset($_POST["phone"]));
    $email=(isset($_POST["email"]));
    $OrderName=(isset($_POST["OrderName"]));
    $sql="INSERT INTO customers(fname,lname,phone,email,OrderName) VALUES('$fname','$lname','$phone','$email',' $OrderName')";
    $stnt=$pdo->prepare($sql);
    //print_r($sql);
    /*$stnt->execute(array(
 'f'=>$fname,
 'l'=>$lname,
 'p'=>$phone,
 'e'=>$email
));*/
?>

<html>
<head>
<meta charset="UTF-8">
<title> document </title>

</head>
<body>
<form action="<?php echo htmlspecialchars ($_SERVER['PHP_SELF']); ?>"method='POST'>
        <div>
            <h1>Cutomer Information</h1>
            <hr>
            <label>First Name </label>
            <input type="text" name="fname" placeholder="Enter First Name">
            <br>
            <label>Last Name </label>
            <input type="text" name="lname" placeholder="Enter Last Name">
            <br>
            <label>Phone Number </label>

            <input type="phone" name="phone" placeholder="Enter Phone Number ">
            <br>
            <label>E-mail </label>

            <input type="text" name="email" placeholder="Enter E-mail">
            <br>
            <label>Your Order </label>
            <input type="text" placeholder="Enter Your Order ">
            <center>
                <input type="submit" name="Send" Value="Submit">
            </center>
            <br>
        </div>

</form>

</body>




</html>