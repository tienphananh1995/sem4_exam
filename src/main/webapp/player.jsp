<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 16/10/2025
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Player</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/3.2.0/css/adminlte.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/dataTables.bootstrap4.min.css">
</head>
<body>
    <div>
        <form action="">
            <div class="row">
                <div class="col-md-6">
                    <label>Player name</label>
                    <input class="form-control" type="text" name="name">
                </div>
                <div class="col-md-6">
                    <label>Player age</label>
                    <input class="form-control" type="text" name="age">
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <label>Index name</label>
                    <select name="indexId" class="form-control">
                        <option value="art">Art</option>
                        <option value="collectibles">Collectibles</option>
                        <option value="photography">Photography</option>
                        <option value="technology">Technology</option>
                        <option value="music">Music</option>
                    </select>
                </div>
                <div class="col-md-6">
                    <label>Value</label>
                    <select name="valueId" class="form-control">
                        <option value="art">Art</option>
                        <option value="collectibles">Collectibles</option>
                        <option value="photography">Photography</option>
                        <option value="technology">Technology</option>
                        <option value="music">Music</option>
                    </select>
                </div>
            </div>
            <button type="submit" class="btn btn-default">Add</button>
        </form>
        <div class="card-body">
            <table id="productsTable" class="table table-bordered table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Player name</th>
                    <th>Player age</th>
                    <th>Index name</th>
                    <th>Value</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
<%--                <%--%>
<%--                    List<Player> list = (List<Product>) request.getAttribute("products");--%>
<%--                    for(Product p : list){--%>
<%--                %>--%>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <a href="" class="btn btn-sm btn-info">
                            <i class="fas fa-edit"></i>
                        </a>
                        <a href="" class="btn btn-sm btn-danger" onclick="return confirm('')">
                            <i class="fas fa-trash"></i>
                        </a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
