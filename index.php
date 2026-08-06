<?php

$server_name = "localhost";
$username = "root";
$password = "";
$db_name = "blitzapp";

$connection = new mysqli($server_name, $username, $password, $db_name);

if ($connection->connect_error)
{
    die("Erreur connexion : " . $connection->connect_error);
}

$opt = $_GET["opt"];

if ($opt == "save")
{
    $player = $_GET["player"];
    $coins = intval($_GET["coins"]);

    $sql = "INSERT INTO stats (player, coins) VALUES ('$player', '$coins')";

    if ($connection->query($sql))
    {
        echo "OK";
    }
    else
    {
        echo "SQL Error: " . $connection->error;
    }
}

$connection->close();

?>