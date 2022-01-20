<!doctype html>
<#import "spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Клиенты</title>
    <style type="text/css">
        TABLE {
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
        }
        TD, TH {
            border: 1px solid black; /* Параметры рамки */
        }
        TH {
            background: #f17063; /* Цвет фона */
        }
    </style>
</head>
<body>
<h3>Клиенты</h3>
<table>
    <tr>
        <th>Id</th>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Отчество</th>
        <th>Номер телефона</th>
        <th>email</th>
        <th>Номер паспорта</th>
    </tr>
    <#list customers as customer>
        <tr>
            <td align="center">${customer.id}</td>
            <td align="center">${customer.lastName}</td>
            <td align="center">${customer.firstName}</td>
            <td align="center">${customer.patronymic}</td>
            <td align="center">${customer.telephoneNumber}</td>
            <td align="center">${customer.email}</td>
            <td align="center">${customer.passportNumber}</td>
        </tr>
    </#list>
    <tr>
    <form method="post" action="/addCustomer">
        <td>...</td>
        <td><input type=text name="lastName" placeholder="Фамилия" ></td>
        <td><input type=text name="firstName" placeholder="Имя"></td>
        <td><input type=text name="patronymic" placeholder="Отчество"></td>
        <td><input type=text name="telephoneNumber" placeholder="Номер телефона"></td>
        <td><input type=email name="email" placeholder="email"></td>
        <td><input type=text name="passportNumber" placeholder="Номер паспорта"></td>
        <td><input type="submit" value="Создать..."></td>
    </form>
    </tr>
</table>

</body>
</html>
