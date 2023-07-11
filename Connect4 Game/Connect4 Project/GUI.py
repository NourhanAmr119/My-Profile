import tkinter as tk
from tkinter import ttk
import sys
sys.path.append('C:Users\hp\OneDrive\Desktop\AI-Project\Connect4 Project\Alpha_beta.py')
from Alpha_beta import start_game_alpha
sys.path.append('C:Users\hp\OneDrive\Desktop\AI-Project\Connect4 Project\/Minimax.py')
from Minimax import start_game_minimax


def create_gui():
    root = tk.Tk()
    root.title("Connect 4")
    root.geometry("1000x500")
    root.configure(bg='purple')

    algorithm_var = tk.IntVar(value=0)
    difficulty_var = tk.IntVar(value=0)

    def start_game_gui():
        algorithm_type = algorithm_var.get()  # 0 for Minimax, 1 for Alpha-Beta
        difficulty_level = difficulty_var.get()  # 0 for easy, 1 for hard
        root.destroy()

        if difficulty_level == 0:
            d = 2
        elif difficulty_level == 1:
            d = 3
        else:
            d = 5
        if algorithm_type == 1:
            start_game_alpha(d)
        else:
            start_game_minimax(d)

    # Customizing the style
    style = tk.ttk.Style(root)
    style.configure('TButton', bg='black', foreground='violet', font=('Arial', 46, "bold"))
    style.configure('TRadiobutton', background='purple', foreground='black', font=('Arial', 36, "bold"))

    algorithm_label = tk.Label(root, text="Select Algorithm:", bg='purple', fg='violet', font=('Arial', 30))
    algorithm_label.pack()

    algorithm_radio_minimax = ttk.Radiobutton(root, text="Minimax", variable=algorithm_var, value=0)
    algorithm_radio_minimax.pack()

    algorithm_radio_alphabeta = ttk.Radiobutton(root, text="Alpha-Beta", variable=algorithm_var, value=1)
    algorithm_radio_alphabeta.pack()

    difficulty_label = tk.Label(root, text="Select Difficulty:", bg='purple', fg='violet', font=('Arial', 30))
    difficulty_label.pack()

    difficulty_radio_easy = ttk.Radiobutton(root, text="Easy", variable=difficulty_var, value=0)
    difficulty_radio_easy.pack()

    difficulty_radio_easy = ttk.Radiobutton(root, text="Medium", variable=difficulty_var, value=1)
    difficulty_radio_easy.pack()

    difficulty_radio_hard = ttk.Radiobutton(root, text="Hard", variable=difficulty_var, value=2)
    difficulty_radio_hard.pack()

    start_button = ttk.Button(root, text="Start Game", command=start_game_gui)
    start_button.pack()

    root.mainloop()


if __name__ == "__main__":
    create_gui()
