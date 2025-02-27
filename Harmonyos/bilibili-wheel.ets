@Entry
@Component
//可读性很强 可写性很差 但很好改
//属性和值
//全集 删除
//做一个顶级芯片 只用改就行了
struct index{
    build(){
        Column(){
            //b站视频卡片
            Column(){
                Stack({alignContent: Alignment.Bottom}){
                    Image($r('app.meida.bz_img'))
                    .borderRadius({
                        topleft: 10,
                        topright: 10
                    })
                }
            }
            .width(200)
            .height(200)
            .backgroundColor(Color.White)
            .borderRadius(10)
            .margin({top: 10})
        }
        .width('100%')
        .height('100%')
        .backgroundColor('#ccc')
    }
}