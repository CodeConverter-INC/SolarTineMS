import requests
import os

def fetch_commits(owner, repo, per_page=30, page=1):
    url = f"https://api.github.com/repos/{owner}/{repo}/commits"
    headers = {
        "Accept": "application/vnd.github.v3+json",
        "Authorization": f"token {os.getenv('GITHUB_TOKEN')}"
    }
    params = {
        "per_page": per_page,
        "page": page
    }
    response = requests.get(url, headers=headers, params=params)
    return response.json() if response.status_code == 200 else []

def analyze_commits():
    owner = "breakcraft"
    repo = "SolarTineMS"
    commits = []
    page = 1
    while True:
        page_commits = fetch_commits(owner, repo, page=page)
        if not page_commits:
            break
        commits.extend(page_commits)
        page += 1

    for commit in commits[:5]:  # Displaying the first 5 commits as an example
        print(f"SHA: {commit['sha']}\nMessage: {commit['commit']['message']}\n")

if __name__ == "__main__":
    analyze_commits()
