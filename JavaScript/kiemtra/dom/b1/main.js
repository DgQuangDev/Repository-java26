// Hàm chọn ngẫu nhiên một câu trả lời cho mỗi câu hỏi
function randomAnswer() {
  // Lấy tất cả các phần tử câu hỏi
  const quizItems = document.querySelectorAll(".quiz-item");

  // Duyệt qua mỗi câu hỏi
  quizItems.forEach((quizItem) => {
    // Tìm tất cả các câu trả lời (input radio) của câu hỏi hiện tại
    const answers = quizItem.querySelectorAll('input[type="radio"]');

    // Chọn ngẫu nhiên một câu trả lời
    const randomIndex = Math.floor(Math.random() * answers.length);

    // Đặt câu trả lời ngẫu nhiên được chọn
    answers[randomIndex].checked = true;
  });
}

// Gán sự kiện click cho nút "Random Answer"
document.getElementById("btn").addEventListener("click", randomAnswer);

// Gọi hàm randomAnswer() ngay khi trang load để chọn câu trả lời ngẫu nhiên khi trang vừa mở
window.onload = randomAnswer;
