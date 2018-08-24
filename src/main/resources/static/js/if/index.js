var app = new Vue({
    el: '#main-container',
    data: {
        sites: []
    },
    methods: {
        initData: function () {
            var sites = []
            for (var i = 0;i<10;i++) {
                var site = {}
                site.title = "掘金 - 后端" + i;
                site.articles = []
                for(var j = 0;j<5;j++){
                    site.articles.push({
                        title: "有没有支持在线 DDOS 压力测试的网站呀？",
                        url: "http://blog.zhangyingwei.com",
                        author: "zjh1025",
                        pubdate: "2018年1月1日"
                    })
                }
                sites.push(site)
            }
            var self = this
            util.loading()
            setTimeout(function(){
                self.sites = sites
                util.closeLoading()
            },1000)
        }
    },
    mounted:function () {
        this.initData()
    }
})