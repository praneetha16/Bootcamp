import requests
def update_todo():
    url = "https://jsonplaceholder.typicode.com/todos/1"
    headers = {'Content-type': 'application/json'}
    todo_data = {'title': 'Updated todo'}
    response = requests.patch(url, json=todo_data, headers=headers)
    print(response.json())
    print(response.status_code)

if __name__ == "__main__":
    update_todo()