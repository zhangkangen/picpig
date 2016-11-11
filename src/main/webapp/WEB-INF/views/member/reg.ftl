<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/content/css/bootstrap.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-5">
            <h1>注册页面</h1>
            <form role="form" action="/member/reg" method="post">
                <div class="form-group">
                    用户名: <input class="form-control" type="text" name="username">
                </div>
                <div class="form-group">
                    密码:<input class="form-control" type="password" name="password">
                </div>
                <div class="form-group">
                    <input class="form-control btn-default col-md-2" type="submit" value="注册">
                </div>
            </form>
        </div>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="/content/js/bootstrap.js"></script>
</body>
</html>