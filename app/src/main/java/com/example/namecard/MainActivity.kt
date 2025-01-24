package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.collection.intFloatMapOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme
import java.util.jar.Attributes.Name

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NameCardTheme {
                NameCardPic()
            }
        }
    }
}

//function is here
@Composable
fun NameCardPic(modifier: Modifier = Modifier,){
    val myPic = painterResource(R.drawable.fursona)

    Column (
        verticalArrangement = Arrangement.Center,       //使所有元素居中排列
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()      //让组件全屏化，确保
            .background(color = Color(0xffBDD5FF))
    ){
        Image(
            painter = myPic,
            contentDescription = "a picture of the developer"
        )
        Text(
            text = "竹光",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2c3c9c),
            modifier = Modifier
                .padding(15.dp)

        )

        Spacer(modifier = Modifier.height(50.dp))      //使用Spacer方法来快捷地调整两个元素的间距

        //下方的文本信息
        Text(
            text = "📞:   +86 1145141919\n\uD83D\uDD17:    BlackMesa.com",
            fontSize = 18.sp,
            lineHeight = 35.sp,
            )




    }
//    Column (
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//                .fillMaxSize()
//    ){
//        Text(
//            text = "📞: +86 1145141919\n\uD83D\uDD17: BlackMesa.com",
//            fontSize = 18.sp,
//            lineHeight = 35.sp,
//            modifier = Modifier
//                .padding(
//                    bottom = 80.dp
//                )
//            )
//    }


}

@Preview(showBackground = true)
@Composable
fun Preview() {
    NameCardTheme {
        NameCardPic()
    }
}