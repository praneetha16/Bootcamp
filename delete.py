import requests
def delete_todo():
    url = "https://jsonplaceholder.typicode.com/todos/1"
    response = requests.delete(url)
    print(response.json())
    print(response.status_code)

if __name__ == "__main__":
    delete_todo()
