<html>
<head>
    <title>${title!''}</title>
    <link rel="stylesheet" href="/content/css/bootstrap.css">
    <link rel="stylesheet" href="/content/toastr.css">
</head>
<body>
<div class="container" style="margin-top: 50px;">
    <div class="row">
    <div class="col-md-12">
    <#if (albumList?size)!=0>
        <div class="col-md-12">
            <#list albumList as album>
                <div class="col-md-2">
                    <img src="${album.albumCover!'/img/album_cover_default.jpg'}" class="thumb" width="140px"
                         height="140px">
                    <a style="margin-left: 10px">${album.albumName}</a>
                    <span style="margin-left: 10px;align-content: flex-end"><a class="btn_delete btn-link" href="#"
                                                                               onclick="btn_delete(${album.id})">删除</a></span>
                </div>
            </#list>
        </div>
        <form role="form" id="form_add" class="form-inline" action="/album/add" method="post">
            <div class="form-group">
                <label for="albumName" class="sr-only">相册名</label>
                <div class="input-group">
                    <div class="input-group-addon">相册名</div>
                    <input id="albumName" type="text" class="form-control" name="albumName" placeholder="album name"
                           required>
                </div>
            </div>
            <!-- Button trigger modal -->
            <button id="btn_add" type="text" class="btn btn-primary">
                添加相册
            </button>
        </form>
    </div>
    </#if>
    </div>
</div>
</div>

<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.js"></script>
<script src="/content/js/bootstrap.js"></script>
<script src="/content/toastr.js"></script>
<script>
    $(function () {
    <#if (albumList?size)==0>
        toastr.error('还没有相册', '', {timeOut: 1000});
    </#if>

    <#if (ResponseMsg?exists)>
        toastr.error(${ResponseMsg});
    </#if>

        $('#btn_add').click(function () {

            $('#form_add').submit(function (res) {
                $(this)submit();
                return false;
            })
        })
    })

    function btn_delete(id) {
        $.ajax({
            url: '/album/delete/' + id,
            type: 'DELETE',
            success: function (res) {
                toastr.success(res.msg);

                if (res.success) {
                    setTimeout(function () {
                        window.location.href = "/album";
                    }, 3000);
                }
            }
        })
    }

</script>
</body>
</html>
