<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>api console</title>
    <link rel="stylesheet" href="/css/common.css"/>
    <link rel="stylesheet" href="/css/console.css"/>
</head>
<body>
    <div class="wrapper flex-dir-row fill-full flex-nowrap">
        <#--侧边栏-->
        <div class="sidebar flex-dir-column flex-cross-dir-center height-full">

        </div>
        <#--标签栏-->
        <div class="tab-container flex-dir-column flex-cross-dir-center height-full">

        </div>
        <#--活页容器-->
        <div class="content-container flex-dir-column fill-full">
            <div class="content-tab-bar flex-dir-row width-full flex-nowrap">
                <#--标签页-->
                <div class="content-tab fill-full"></div>
            </div>
            <#--接口url-->
            <div class="content-panel flex-dir-column fill-full">
                <div class="panel-url-wrapper flex-dir-row width-full">
                    <div class="panel-url flex-dir-row fill-full flex-nowrap">
                        <select class="panel-url-method">
                            <option name="POST" selected></option>
                            <option name="GET" selected></option>
                        </select>
                        <input class="panel-url-link">
                    </div>
                    <button class="panel-url-send height-full">send</button>
                    <button class="panel-url-save height-full">save</button>
                </div>
                <div class="panel-req flex-dir-column fill-full">
                    <div class="panel-req flex-dir-row width-full"></div>
                </div>
                <div class="panel-res flex-dir-column fill-full">
                </div>
            </div>
        </div>
    </div>
</body>
<script src="/js/req.js" type="javascript"></script>
</html>