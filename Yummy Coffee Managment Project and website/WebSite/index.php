<?php
$dbHost="localhost";
$dbUser="root";
$dbPassword="";
$dbName="YummyDataBase";

try {
    $dsn="mysql:host=".$dbHost .";dbName".$dbName;
    $pdo=new PDO($dsn,$dbUser,$dbPassword);
    echo "تم";
} catch (PDOException $e) {
    echo "حدث خطأ" . $e->getline();
}



?>
