function changeColor() {
  //đây là code javecript để đổi màu chữ ở thẻ h2
  document.getElementsByTagName("h2")[0].style.backgroundColor = "red";
}
function changeH2Text() {
  //đây là code javascript để đổi nội dung của thẻ h2
  document.getElementsByTagName("h2")[0].innerHTML = "Nội dung";
}
//trong javascript có 3 loại biến var , let và const
var a = 5;
var b = 6.5;
var c = "Phan Duy Quang";

//var có thể khai báo biến thay cho int , double và string
//những giờ khuyên ko dùng var nữa mà dùng let và const'

//let dùng để biểu diễn các biến có thể thay đổi ( cộng trừ ... )
//const thì là 1 hằng số , 1 hằng số tức là đã gán từ đâu là mãi mãi không thay đổi gia trị

//bài tập về nhà
//bài 1:
function calculateFactorial(n) {
  // Kiểm tra nếu n nhỏ hơn 0 thì không hợp lệ
  if (n < 0) {
    return "Số nhập vào phải là số nguyên dương";
  }

  // Giai thừa của 0 và 1 đều bằng 1
  if (n === 0 || n === 1) {
    return 1;
  }

  // Tính giai thừa bằng cách nhân từ 1 đến n
  let factorial = 1;
  for (let i = 2; i <= n; i++) {
    factorial *= i;
  }

  return factorial;
}

//bài 2
function reverseString(str) {
  // Chuyển chuỗi thành một mảng, đảo ngược mảng, sau đó chuyển mảng về chuỗi
  return str.split("").reverse().join("");
}

//bài 3
function translate(countryCode) {
  let message;

  switch (countryCode) {
    case "VN":
      message = "Xin chào";
      break;
    case "EN":
      message = "Hello";
      break;
    case "FR":
      message = "Bonjour";
      break;
    case "ES":
      message = "Hola";
      break;
    case "JP":
      message = "こんにちは"; // Konnichiwa
      break;
    case "KR":
      message = "안녕하세요"; // Annyeonghaseyo
      break;
    case "CN":
      message = "你好"; // Nǐ hǎo
      break;
    default:
      message = "Mã quốc gia không hợp lệ";
  }

  return message;
}

//bài 4
function subString(str) {
  // Kiểm tra nếu chuỗi dài hơn 15 ký tự
  if (str.length > 15) {
    // Cắt 10 ký tự đầu tiên và thêm dấu "..." ở cuối
    return str.substring(0, 10) + "...";
  }
  // Nếu chuỗi không dài hơn 15 ký tự, trả về chuỗi gốc
  return str;
}
