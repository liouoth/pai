let CONSOLE_REQUEST = {
    options: {
        method: 'post',
        url: '',
        isAsync: true,
        content_type: 'application/x-www-form-urlencoded',
        body: ''
    },
    create: function (options) {
        if (options != null || options.url != '') {
            this.options = options;
        }
        let request = new XMLHttpRequest();
        return request;
    }
}


