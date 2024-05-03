import requests
def create_todo():
    url = "https://jsonplaceholder.typicode.com/todos"
    headers = {'Content-type': 'application/json'}
    todo_data = {'userId': 1, 'title': 'When life gives you lemons make a lemonade', 'completed': False}
    response = requests.post(url, json=todo_data, headers=headers)
    if response.status_code == 201:
        print(response.json())
        print(response.status_code)

    else:
        print("Failed to create todo. Status code:", response.status_code)

if __name__ == "__main__":
    create_todo()