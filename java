# Create a simple HTML file with embedded CSS and JavaScript to demonstrate a working example for Google Sites iframe embedding.

html_content = """
<!DOCTYPE html>
<html>
<head>
  <style>
    body {
      background-color: #e6f4ea;
      color: #333;
      font-family: Arial, sans-serif;
      padding: 20px;
    }
    .container {
      border: 2px solid #4CAF50;
      border-radius: 10px;
      padding: 20px;
      text-align: center;
    }
    button {
      padding: 10px 20px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      font-size: 16px;
    }
    button:hover {
      background-color: #45a049;
    }
  </style>
  <script>
    function greetUser() {
      alert('Namaste! Thank you for visiting Dr. Sandip\'s Ayurveda');
    }
  </script>
</head>
<body>
  <div class="container">
    <h2>Welcome to Dr. Sandip's Ayurveda</h2>
    <p>We are glad to have you here. Click below to say hello!</p>
    <button onclick="greetUser()">Say Hello</button>
  </div>
</body>
</html>
"""

# Save the HTML file to be downloaded and uploaded to a hosting platform
file_path = "/mnt/data/DrSandip_Ayurveda_Embed.html"
with open(file_path, "w") as file:
    file.write(html_content)

file_path
