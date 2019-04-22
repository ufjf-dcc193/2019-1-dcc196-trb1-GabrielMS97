<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>Sedes</title>
</head>

<body>
    <h1> Sedes </h1>
    <br />

    <table border="3px">
        <thead>
            <th>Sede</th>
            <th>Estado</th>
            <th>Cidade</th>
            <th>Bairro</th>
            <th>Telefone</th>
            <th>Endereço Web</th>
            <th>Editar</th>
            <th>Excluir</th>
        </thead>
        <tbody>
            <c:forEach var="sede" items="${sedes}">
                <tr>
                    <td>${sede.getNome()}</td>
                    <td>${sede.getEstado()}</td>
                    <td>${sede.getCidade()}</td>
                    <td>${sede.getBairro()}</td>
                    <td>${sede.getTelefone()}</td>
                    <td>${sede.getEnderecoWeb()}</td>
                    <td>
                        <a href="">Editar</a>
                    </td>
                    <td>
                        <a href="">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <a href="cadastro-sedes.html">Cadastrar nova sede</a>
    </div>
</body>

</html>