import requests
def get_todo():
    response = requests.get("https://jsonplaceholder.typicode.com/todos/8")
    if response.status_code == 200:
        result = response.json()
        print(result)
    else:
        print("Failed to fetch todo. Status code:", response.status_code)

if __name__ == "__main__":
    get_todo()



