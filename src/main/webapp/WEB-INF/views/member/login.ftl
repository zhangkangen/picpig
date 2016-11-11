<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/content/css/bootstrap.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-5">
            <h1 class="h1">登陆页面</h1>
            <form role="form" action="/member/login" method="post" class="form">
                <div class="form-group">
                    <label for="">用户名</label>
                    <input type="text" class="form-control" name="username">
                </div>
                <div class="form-group">
                    <label for="">密码</label>
                    <input type="password" class="form-control" name="password">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="登录">
                    <a href="/member/reg" class="btn btn-default">注册</a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
