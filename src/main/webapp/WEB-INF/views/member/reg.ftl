<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/content/css/bootstrap.css">
</head>
<body>

<div class="container">
    <div class="row">
        <h1 class="h1">注册页面</h1>
        <form role="form" class="col-md-6 form-horizontal" action="/member/reg" method="post">
            <div class="form-group">
                <label for="username" class="control-label col-md-2">用户名</label>
                <div class="col-md-4">
                    <input class="form-control" type="text" name="username" placeholder="username" required>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="control-label col-md-2">密码</label>
                <div class="col-md-4">
                    <input class="form-control" type="password" name="password" placeholder="password" required>
                </div>
            </div>
            <div class="form-group">
                <input class="col-md-offset-2 col-md-2 btn btn-primary" type="submit" value="注册">
            </div>
        </form>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="/content/js/bootstrap.js"></script>
</body>
</html>